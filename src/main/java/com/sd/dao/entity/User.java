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
 * @author Vikram This class is used to keep application users info
 *
 */

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "bigint(11)", name = "id", nullable = false)
	private Integer id;

	@Column(columnDefinition = "varchar(128)", nullable = false)
	private String uuid; // This is UUID in string

	@Column(columnDefinition = "varchar(255)", nullable = false)
	private String email;

	@Column(columnDefinition = "varchar(128)", nullable = false)
	private String fisrstName;

	@Column(columnDefinition = "varchar(128)", nullable = false)
	private String lastName;

	@Column(columnDefinition = "varchar(128)", nullable = true)
	private String middleName;

	@Column(columnDefinition = "varchar(255)", nullable = false)
	private String userName;

	@Column(name = "password", nullable = false)
	private String password;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "passwordExpiresOn")
	private Date passwordExpiresOn;

	@Column(columnDefinition = "varchar(256)")
	private String address;

	@Column(columnDefinition = "varchar(128)")
	private String city;

	@Column(columnDefinition = "varchar(128)")
	private String state;

	@Column(columnDefinition = "varchar(64)")
	private String postalCode;

	@Column(columnDefinition = "varchar(64)")
	private String country;

	@Column(columnDefinition = "varchar(64)")
	private String phone;

	/**
	 * Role of user like SuperAdmin, Admin, SiteAdmin, Gaurdian This is ENUM
	 * like Guardian,
	 */
	@ManyToOne
	@JoinColumn(name = "roleId", referencedColumnName = "id", nullable = false )
	private Role roleId;
	


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdOn")
	private Date createdOn; // User create date

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedOn")
	private Date modifiedOn; // User modified date

	@Column(columnDefinition = "varchar(30)", nullable = false)
	private String status;

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
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid
	 *            the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the passwordExpiresOn
	 */
	public Date getPasswordExpiresOn() {
		return passwordExpiresOn;
	}

	/**
	 * @param passwordExpiresOn
	 *            the passwordExpiresOn to set
	 */
	public void setPasswordExpiresOn(Date passwordExpiresOn) {
		this.passwordExpiresOn = passwordExpiresOn;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 *            the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn
	 *            the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the modifiedOn
	 */
	public Date getModifiedOn() {
		return modifiedOn;
	}

	/**
	 * @param modifiedOn
	 *            the modifiedOn to set
	 */
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the roleId
	 */
	public Role getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}


}
