/**
 * 
 */
package com.sd.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sd.dao.entity.UserStudent;

/**
 * @author Vikram
 *
 */
@Repository
public interface UserStudentRepository extends JpaRepository<UserStudent, Integer>{

	
	
}
