/**
 * This class is generated by jOOQ
 */
package services.generated.tables.records


import java.lang.Integer
import java.lang.String
import java.sql.Timestamp
import java.util.UUID

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record12
import org.jooq.Row12
import org.jooq.impl.UpdatableRecordImpl

import services.generated.tables.Task


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
class TaskRecord extends UpdatableRecordImpl[TaskRecord](Task.TASK) with Record12[UUID, String, String, UUID, String, UUID, String, Timestamp, Timestamp, String, String, Integer] {

	/**
	 * Setter for <code>public.task.id</code>.
	 */
	def setId(value : UUID) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>public.task.id</code>.
	 */
	def getId : UUID = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[UUID]
	}

	/**
	 * Setter for <code>public.task.task_type</code>.
	 */
	def setTaskType(value : String) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>public.task.task_type</code>.
	 */
	def getTaskType : String = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.task.class_name</code>.
	 */
	def setClassName(value : String) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>public.task.class_name</code>.
	 */
	def getClassName : String = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.task.job_id</code>.
	 */
	def setJobId(value : UUID) : Unit = {
		setValue(3, value)
	}

	/**
	 * Getter for <code>public.task.job_id</code>.
	 */
	def getJobId : UUID = {
		val r = getValue(3)
		if (r == null) null else r.asInstanceOf[UUID]
	}

	/**
	 * Setter for <code>public.task.document_id</code>.
	 */
	def setDocumentId(value : String) : Unit = {
		setValue(4, value)
	}

	/**
	 * Getter for <code>public.task.document_id</code>.
	 */
	def getDocumentId : String = {
		val r = getValue(4)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.task.filepart_id</code>.
	 */
	def setFilepartId(value : UUID) : Unit = {
		setValue(5, value)
	}

	/**
	 * Getter for <code>public.task.filepart_id</code>.
	 */
	def getFilepartId : UUID = {
		val r = getValue(5)
		if (r == null) null else r.asInstanceOf[UUID]
	}

	/**
	 * Setter for <code>public.task.spawned_by</code>.
	 */
	def setSpawnedBy(value : String) : Unit = {
		setValue(6, value)
	}

	/**
	 * Getter for <code>public.task.spawned_by</code>.
	 */
	def getSpawnedBy : String = {
		val r = getValue(6)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.task.spawned_at</code>.
	 */
	def setSpawnedAt(value : Timestamp) : Unit = {
		setValue(7, value)
	}

	/**
	 * Getter for <code>public.task.spawned_at</code>.
	 */
	def getSpawnedAt : Timestamp = {
		val r = getValue(7)
		if (r == null) null else r.asInstanceOf[Timestamp]
	}

	/**
	 * Setter for <code>public.task.stopped_at</code>.
	 */
	def setStoppedAt(value : Timestamp) : Unit = {
		setValue(8, value)
	}

	/**
	 * Getter for <code>public.task.stopped_at</code>.
	 */
	def getStoppedAt : Timestamp = {
		val r = getValue(8)
		if (r == null) null else r.asInstanceOf[Timestamp]
	}

	/**
	 * Setter for <code>public.task.stopped_with</code>.
	 */
	def setStoppedWith(value : String) : Unit = {
		setValue(9, value)
	}

	/**
	 * Getter for <code>public.task.stopped_with</code>.
	 */
	def getStoppedWith : String = {
		val r = getValue(9)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.task.status</code>.
	 */
	def setStatus(value : String) : Unit = {
		setValue(10, value)
	}

	/**
	 * Getter for <code>public.task.status</code>.
	 */
	def getStatus : String = {
		val r = getValue(10)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>public.task.progress</code>.
	 */
	def setProgress(value : Integer) : Unit = {
		setValue(11, value)
	}

	/**
	 * Getter for <code>public.task.progress</code>.
	 */
	def getProgress : Integer = {
		val r = getValue(11)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[UUID] = {
		return super.key.asInstanceOf[ Record1[UUID] ]
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row12[UUID, String, String, UUID, String, UUID, String, Timestamp, Timestamp, String, String, Integer] = {
		super.fieldsRow.asInstanceOf[ Row12[UUID, String, String, UUID, String, UUID, String, Timestamp, Timestamp, String, String, Integer] ]
	}

	override def valuesRow : Row12[UUID, String, String, UUID, String, UUID, String, Timestamp, Timestamp, String, String, Integer] = {
		super.valuesRow.asInstanceOf[ Row12[UUID, String, String, UUID, String, UUID, String, Timestamp, Timestamp, String, String, Integer] ]
	}
	override def field1 : Field[UUID] = Task.TASK.ID
	override def field2 : Field[String] = Task.TASK.TASK_TYPE
	override def field3 : Field[String] = Task.TASK.CLASS_NAME
	override def field4 : Field[UUID] = Task.TASK.JOB_ID
	override def field5 : Field[String] = Task.TASK.DOCUMENT_ID
	override def field6 : Field[UUID] = Task.TASK.FILEPART_ID
	override def field7 : Field[String] = Task.TASK.SPAWNED_BY
	override def field8 : Field[Timestamp] = Task.TASK.SPAWNED_AT
	override def field9 : Field[Timestamp] = Task.TASK.STOPPED_AT
	override def field10 : Field[String] = Task.TASK.STOPPED_WITH
	override def field11 : Field[String] = Task.TASK.STATUS
	override def field12 : Field[Integer] = Task.TASK.PROGRESS
	override def value1 : UUID = getId
	override def value2 : String = getTaskType
	override def value3 : String = getClassName
	override def value4 : UUID = getJobId
	override def value5 : String = getDocumentId
	override def value6 : UUID = getFilepartId
	override def value7 : String = getSpawnedBy
	override def value8 : Timestamp = getSpawnedAt
	override def value9 : Timestamp = getStoppedAt
	override def value10 : String = getStoppedWith
	override def value11 : String = getStatus
	override def value12 : Integer = getProgress

	override def value1(value : UUID) : TaskRecord = {
		setId(value)
		this
	}

	override def value2(value : String) : TaskRecord = {
		setTaskType(value)
		this
	}

	override def value3(value : String) : TaskRecord = {
		setClassName(value)
		this
	}

	override def value4(value : UUID) : TaskRecord = {
		setJobId(value)
		this
	}

	override def value5(value : String) : TaskRecord = {
		setDocumentId(value)
		this
	}

	override def value6(value : UUID) : TaskRecord = {
		setFilepartId(value)
		this
	}

	override def value7(value : String) : TaskRecord = {
		setSpawnedBy(value)
		this
	}

	override def value8(value : Timestamp) : TaskRecord = {
		setSpawnedAt(value)
		this
	}

	override def value9(value : Timestamp) : TaskRecord = {
		setStoppedAt(value)
		this
	}

	override def value10(value : String) : TaskRecord = {
		setStoppedWith(value)
		this
	}

	override def value11(value : String) : TaskRecord = {
		setStatus(value)
		this
	}

	override def value12(value : Integer) : TaskRecord = {
		setProgress(value)
		this
	}

	override def values(value1 : UUID, value2 : String, value3 : String, value4 : UUID, value5 : String, value6 : UUID, value7 : String, value8 : Timestamp, value9 : Timestamp, value10 : String, value11 : String, value12 : Integer) : TaskRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this.value4(value4)
		this.value5(value5)
		this.value6(value6)
		this.value7(value7)
		this.value8(value8)
		this.value9(value9)
		this.value10(value10)
		this.value11(value11)
		this.value12(value12)
		this
	}

	/**
	 * Create a detached, initialised TaskRecord
	 */
	def this(id : UUID, taskType : String, className : String, jobId : UUID, documentId : String, filepartId : UUID, spawnedBy : String, spawnedAt : Timestamp, stoppedAt : Timestamp, stoppedWith : String, status : String, progress : Integer) = {
		this()

		setValue(0, id)
		setValue(1, taskType)
		setValue(2, className)
		setValue(3, jobId)
		setValue(4, documentId)
		setValue(5, filepartId)
		setValue(6, spawnedBy)
		setValue(7, spawnedAt)
		setValue(8, stoppedAt)
		setValue(9, stoppedWith)
		setValue(10, status)
		setValue(11, progress)
	}
}
