/**
 * 
 */
package com.sd.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sd.dao.entity.Student;

/**
 * @author Vikram
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	public List<Student> findByPhone(String phone);

}
