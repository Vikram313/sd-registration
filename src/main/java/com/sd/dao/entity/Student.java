/**
 * 
 */
package com.sd.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Vikram
 * This class is entity class to hold students info
 */
@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "bigint(11)", name = "id", nullable = false)
	private Integer id;

	@Column(columnDefinition = "varchar(255)", nullable = false, unique = true)
	private String uuid;

	@Column(columnDefinition = "varchar(128)", nullable = false)
	private String fisrstName;
	
	@Column(columnDefinition = "varchar(128)", nullable = false)
	private String lastName;
	
	@Column(columnDefinition = "varchar(128)", nullable = true)
	private String middleName;
	
	@Column(columnDefinition = "varchar(255)", nullable = false)
	private String fatherName;
	
	@Column(columnDefinition = "varchar(255)", nullable = false)
	private String motherName;
	
	@Column(columnDefinition = "varchar(64)", nullable = true)
	private String phone;
	
	@ManyToOne
	@JoinColumn(name = "schoolId", referencedColumnName = "id", nullable = false )
	private School schoolId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dob")
	private Date dob;

	

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the schoolId
	 */
	public School getSchoolId() {
		return schoolId;
	}

	/**
	 * @param schoolId the schoolId to set
	 */
	public void setSchoolId(School schoolId) {
		this.schoolId = schoolId;
	}

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the fisrstName
	 */
	public String getFisrstName() {
		return fisrstName;
	}

	/**
	 * @param fisrstName the fisrstName to set
	 */
	public void setFisrstName(String fisrstName) {
		this.fisrstName = fisrstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * @param motherName the motherName to set
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", uuid=");
		builder.append(uuid);
		builder.append(", fisrstName=");
		builder.append(fisrstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", fatherName=");
		builder.append(fatherName);
		builder.append(", motherName=");
		builder.append(motherName);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", dob=");
		builder.append(dob);
		builder.append("]");
		return builder.toString();
	}
	
	

}
