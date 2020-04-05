/**
 * 
 */
package com.sd.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vikram
 *
 */

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "bigint(11)", nullable = false)
	private Integer id;

	@Column(columnDefinition = "varchar(50)", unique = true, nullable = false)
	private String roleName;

	// Role preference
	@Column(columnDefinition = "int(11)", unique = true, nullable = false)
	private Integer rolePreference;

	// Role preference
	@Column(columnDefinition = "int(11)", nullable = false)
	private Integer status;

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
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the rolePreference
	 */
	public Integer getRolePreference() {
		return rolePreference;
	}

	/**
	 * @param rolePreference
	 *            the rolePreference to set
	 */
	public void setRolePreference(Integer rolePreference) {
		this.rolePreference = rolePreference;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Role [id=");
		builder.append(id);
		builder.append(", rolename=");
		builder.append(roleName);
		builder.append(", rolePreference=");
		builder.append(rolePreference);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}

}
