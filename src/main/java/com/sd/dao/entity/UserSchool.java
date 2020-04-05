/**
 * 
 */
package com.sd.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Vikram
 *
 */
@Entity
@Table(name="user_school")
public class UserSchool {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "bigint(11)", name = "id", nullable = false)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "schoolId", referencedColumnName = "id", nullable = false )
	private School schoolId;
	
	@ManyToOne
	@JoinColumn(name = "userId", referencedColumnName = "id", nullable = false )
	private User userId;

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
	 * @return the userId
	 */
	public User getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(User userId) {
		this.userId = userId;
	}
	
	

}
