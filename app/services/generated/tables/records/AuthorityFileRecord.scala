/**
 * This class is generated by jOOQ
 */
package services.generated.tables.records


import java.lang.String

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.UpdatableRecordImpl

import services.generated.tables.AuthorityFile


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
class AuthorityFileRecord extends UpdatableRecordImpl[AuthorityFileRecord](AuthorityFile.AUTHORITY_FILE) with Record5[String, String, String, String, String] {

	/**
	 * Setter for <code>public.authority_file.id</code>.
	 */
	def setId(value : String) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>public.authority_file.id</code>.
	 */
	def getId : String = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.authority_file.screen_name</code>.
	 */
	def setScreenName(value : String) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>public.authority_file.screen_name</code>.
	 */
	def getScreenName : String = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.authority_file.shortcode</code>.
	 */
	def setShortcode(value : String) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>public.authority_file.shortcode</code>.
	 */
	def getShortcode : String = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.authority_file.color</code>.
	 */
	def setColor(value : String) : Unit = {
		setValue(3, value)
	}

	/**
	 * Getter for <code>public.authority_file.color</code>.
	 */
	def getColor : String = {
		val r = getValue(3)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.authority_file.url_patterns</code>.
	 */
	def setUrlPatterns(value : String) : Unit = {
		setValue(4, value)
	}

	/**
	 * Getter for <code>public.authority_file.url_patterns</code>.
	 */
	def getUrlPatterns : String = {
		val r = getValue(4)
		if (r == null) null else r.asInstanceOf[String]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[String] = {
		return super.key.asInstanceOf[ Record1[String] ]
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row5[String, String, String, String, String] = {
		super.fieldsRow.asInstanceOf[ Row5[String, String, String, String, String] ]
	}

	override def valuesRow : Row5[String, String, String, String, String] = {
		super.valuesRow.asInstanceOf[ Row5[String, String, String, String, String] ]
	}
	override def field1 : Field[String] = AuthorityFile.AUTHORITY_FILE.ID
	override def field2 : Field[String] = AuthorityFile.AUTHORITY_FILE.SCREEN_NAME
	override def field3 : Field[String] = AuthorityFile.AUTHORITY_FILE.SHORTCODE
	override def field4 : Field[String] = AuthorityFile.AUTHORITY_FILE.COLOR
	override def field5 : Field[String] = AuthorityFile.AUTHORITY_FILE.URL_PATTERNS
	override def value1 : String = getId
	override def value2 : String = getScreenName
	override def value3 : String = getShortcode
	override def value4 : String = getColor
	override def value5 : String = getUrlPatterns

	override def value1(value : String) : AuthorityFileRecord = {
		setId(value)
		this
	}

	override def value2(value : String) : AuthorityFileRecord = {
		setScreenName(value)
		this
	}

	override def value3(value : String) : AuthorityFileRecord = {
		setShortcode(value)
		this
	}

	override def value4(value : String) : AuthorityFileRecord = {
		setColor(value)
		this
	}

	override def value5(value : String) : AuthorityFileRecord = {
		setUrlPatterns(value)
		this
	}

	override def values(value1 : String, value2 : String, value3 : String, value4 : String, value5 : String) : AuthorityFileRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this.value4(value4)
		this.value5(value5)
		this
	}

	/**
	 * Create a detached, initialised AuthorityFileRecord
	 */
	def this(id : String, screenName : String, shortcode : String, color : String, urlPatterns : String) = {
		this()

		setValue(0, id)
		setValue(1, screenName)
		setValue(2, shortcode)
		setValue(3, color)
		setValue(4, urlPatterns)
	}
}