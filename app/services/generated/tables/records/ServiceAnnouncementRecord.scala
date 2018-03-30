/**
 * This class is generated by jOOQ
 */
package services.generated.tables.records


import java.lang.Integer
import java.lang.String

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl

import services.generated.tables.ServiceAnnouncement


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = Array(
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	),
	comments = "This class is generated by jOOQ"
)
class ServiceAnnouncementRecord extends UpdatableRecordImpl[ServiceAnnouncementRecord](ServiceAnnouncement.SERVICE_ANNOUNCEMENT) with Record3[Integer, String, String] {

	/**
	 * Setter for <code>public.service_announcement.id</code>.
	 */
	def setId(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>public.service_announcement.id</code>.
	 */
	def getId : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>public.service_announcement.for_user</code>.
	 */
	def setForUser(value : String) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>public.service_announcement.for_user</code>.
	 */
	def getForUser : String = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.service_announcement.content</code>.
	 */
	def setContent(value : String) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>public.service_announcement.content</code>.
	 */
	def getContent : String = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[String]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[Integer] = {
		return super.key.asInstanceOf[ Record1[Integer] ]
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row3[Integer, String, String] = {
		super.fieldsRow.asInstanceOf[ Row3[Integer, String, String] ]
	}

	override def valuesRow : Row3[Integer, String, String] = {
		super.valuesRow.asInstanceOf[ Row3[Integer, String, String] ]
	}
	override def field1 : Field[Integer] = ServiceAnnouncement.SERVICE_ANNOUNCEMENT.ID
	override def field2 : Field[String] = ServiceAnnouncement.SERVICE_ANNOUNCEMENT.FOR_USER
	override def field3 : Field[String] = ServiceAnnouncement.SERVICE_ANNOUNCEMENT.CONTENT
	override def value1 : Integer = getId
	override def value2 : String = getForUser
	override def value3 : String = getContent

	override def value1(value : Integer) : ServiceAnnouncementRecord = {
		setId(value)
		this
	}

	override def value2(value : String) : ServiceAnnouncementRecord = {
		setForUser(value)
		this
	}

	override def value3(value : String) : ServiceAnnouncementRecord = {
		setContent(value)
		this
	}

	override def values(value1 : Integer, value2 : String, value3 : String) : ServiceAnnouncementRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this
	}

	/**
	 * Create a detached, initialised ServiceAnnouncementRecord
	 */
	def this(id : Integer, forUser : String, content : String) = {
		this()

		setValue(0, id)
		setValue(1, forUser)
		setValue(2, content)
	}
}