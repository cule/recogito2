package controllers.document.settings.actions

import controllers.document.settings.SettingsController
import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.mvc.RequestHeader
import services.HasNullableSeq
import services.document.ExtendedDocumentMetadata
import services.entity.EntityType
import services.user.User

case class GazetteerPreferences(useAll: Boolean, includes: Seq[String])

object GazetteerPreferences extends HasNullableSeq {
  
  implicit val gazetteerPreferencesFormat: Format[GazetteerPreferences] = (
    (JsPath \ "use_all").format[Boolean] and
    (JsPath \ "includes").formatNullable[Seq[String]]
      .inmap(fromOptSeq[String], toOptSeq[String])
  )(GazetteerPreferences.apply, unlift(GazetteerPreferences.unapply))
  
  val DEFAULTS = GazetteerPreferences(true, Seq.empty[String])

}

case class Tag(label: String, uri: Option[String] = None)

object Tag {

  implicit val tagReads: Reads[Tag] = new Reads[Tag] {

    override def reads(json: JsValue): JsResult[Tag] = json match {
      case str: JsString => JsSuccess(Tag(str.value)) 
      case obj: JsObject => JsSuccess(Tag(
        (obj \ "value").as[String],
        (obj \ "uri").asOpt[String]
      ))
      case _ => throw new Exception()
    }
    
  }

  implicit val tagWrites: Writes[Tag] = (
    (JsPath \ "value").write[String] and
    (JsPath \ "uri").writeNullable[String]
  )(unlift(Tag.unapply))

}

trait PreferencesActions { self: SettingsController =>
  
  def showAnnotationPreferences(doc: ExtendedDocumentMetadata, user: User)(implicit request: RequestHeader) = {
    val fGazetteers= self.authorities.listAll(Some(EntityType.PLACE))
    val fCurrentPrefs = self.documents.getDocumentPreferences(doc.id)
    
    val f = for {
      gazetteers <- fGazetteers
      currentPrefs <- fCurrentPrefs
    } yield (gazetteers, currentPrefs)
    
    f.map { case (gazetteers, allPrefs) =>
      val gazetteerPrefs = allPrefs
        .find(_.getPreferenceName == "authorities.gazetteers")
        .flatMap(str => Json.fromJson[GazetteerPreferences](Json.parse(str.getPreferenceValue)).asOpt)
        .getOrElse(GazetteerPreferences.DEFAULTS)

      val taggingVocab = allPrefs
        .find(_.getPreferenceName == "tag.vocabulary")
        .flatMap(p => Json.fromJson[Seq[Tag]](Json.parse(p.getPreferenceValue)).asOpt)
        .getOrElse(Seq.empty)
        
      Ok(views.html.document.settings.preferences(doc, user, gazetteers, gazetteerPrefs, taggingVocab))
    }
  }
    
  def setGazetteerPreferences(docId: String) = self.silhouette.SecuredAction.async { implicit request =>
    // JSON is parsed to case class and instantly re-serialized as a security/sanitization measure!
    jsonDocumentAdminAction[GazetteerPreferences](docId, request.identity.username, { case (document, prefs) =>      
      self.documents.upsertPreferences(docId, "authorities.gazetteers", Json.stringify(Json.toJson(prefs))).map { success =>
        if (success) Ok else InternalServerError
      }
    })
  }

  def setTagVocabulary(docId: String) = self.silhouette.SecuredAction.async { implicit request => 
    jsonDocumentAdminAction[Seq[Tag]](docId, request.identity.username, { case (document, vocabulary) => 
      self.documents.upsertPreferences(docId, "tag.vocabulary", Json.stringify(Json.toJson(vocabulary))).map { success => 
        if (success) Ok else InternalServerError
      }
    }) 
  }

  def clearTagVocabulary(docId: String) = self.silhouette.SecuredAction.async { implicit request => 
    documentAdminAction(docId, request.identity.username, { doc => 
      self.documents.deletePreferences(docId, "tag.vocabulary").map { success => 
        if (success) Ok else InternalServerError
      }
    })
  }
  
}