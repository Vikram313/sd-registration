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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Vikram This class holds all tenants information
 */

@Entity
@Table(name = "school")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "bigint(11)", name = "id", nullable = false)
	private Integer id;
	
	@Column(columnDefinition = "varchar(255)", nullable = false, unique = true)
	private String uuid;

	@Column(columnDefinition = "varchar(255)", nullable = false, unique = true)
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "affilatedOn")
	private Date affilatedOn;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "affilationExpiresOn")
	private Date affilationExpiresOn;
	
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
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the affilatedOn
	 */
	public Date getAffilatedOn() {
		return affilatedOn;
	}

	/**
	 * @param affilatedOn the affilatedOn to set
	 */
	public void setAffilatedOn(Date affilatedOn) {
		this.affilatedOn = affilatedOn;
	}

	/**
	 * @return the affilationExpiresOn
	 */
	public Date getAffilationExpiresOn() {
		return affilationExpiresOn;
	}

	/**
	 * @param affilationExpiresOn the affilationExpiresOn to set
	 */
	public void setAffilationExpiresOn(Date affilationExpiresOn) {
		this.affilationExpiresOn = affilationExpiresOn;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
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
	 * @param city the city to set
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
	 * @param state the state to set
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
	 * @param postalCode the postalCode to set
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
	 * @param country the country to set
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
	 * @param phone the phone to set
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
	 * @param createdOn the createdOn to set
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
	 * @param modifiedOn the modifiedOn to set
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
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("School [id=");
		builder.append(id);
		builder.append(", uuid=");
		builder.append(uuid);
		builder.append(", name=");
		builder.append(name);
		builder.append(", affilatedOn=");
		builder.append(affilatedOn);
		builder.append(", affilationExpiresOn=");
		builder.append(affilationExpiresOn);
		builder.append(", address=");
		builder.append(address);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", country=");
		builder.append(country);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", createdOn=");
		builder.append(createdOn);
		builder.append(", modifiedOn=");
		builder.append(modifiedOn);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
}
