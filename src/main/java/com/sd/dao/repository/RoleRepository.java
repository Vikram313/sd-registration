/**
 * 
 */
package com.sd.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sd.dao.entity.Role;

/**
 * @author Vikram
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	Role findByRoleName(String rolename);

}
