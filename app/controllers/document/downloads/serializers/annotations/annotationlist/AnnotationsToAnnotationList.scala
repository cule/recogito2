package controllers.document.downloads.serializers.annotations.annotationlist

import controllers.document.downloads.serializers.BaseSerializer
import services.ContentType
import services.annotation.{Annotation, AnnotationService}
import services.document.{ExtendedDocumentMetadata, DocumentService}
import play.api.mvc.{AnyContent, Request}
import play.api.libs.json.Json
import scala.concurrent.ExecutionContext

trait AnnotationsToAnnotationList extends BaseSerializer {

  private def toAnnotationResource(baseURI: String, annotation: Annotation) = 
    AnnotationResource(
      s"${baseURI}/annotation/${annotation.annotationId}", 
      "[annotation text goes here]", 
      s"${baseURI}/document/${annotation.annotates.documentId}"
    )

  def documentToIIIF2(doc: ExtendedDocumentMetadata)(implicit documentService: DocumentService,
      annotationService: AnnotationService, request: Request[AnyContent], ctx: ExecutionContext) = {

    // To be used as 'generator' URI
    val recogitoURI = controllers.landing.routes.LandingController.index().absoluteURL
    val listId = s"${recogitoURI}/api/document/${doc.id}/iiif/annotations"

    annotationService.findByDocId(doc.id).map { annotations =>
      Json.toJson(AnnotationList(listId, annotations.map(t => toAnnotationResource(recogitoURI, t._1))))
    }
  }

}
