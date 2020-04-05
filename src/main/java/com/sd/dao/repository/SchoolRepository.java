/**
 * 
 */
package com.sd.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sd.dao.entity.School;

/**
 * @author Vikram
 *
 */
@Repository
public interface SchoolRepository extends JpaRepository<School, Integer>{

}
