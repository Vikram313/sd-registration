/**
 * 
 */
package com.sd.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sd.dao.entity.UserSchool;

/**
 * @author Vikram
 *
 */
@Repository
public interface UserSchoolRepository extends JpaRepository<UserSchool, Integer>{

}
