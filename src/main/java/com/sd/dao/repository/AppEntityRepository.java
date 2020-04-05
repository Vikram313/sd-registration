/**
 * 
 */
package com.sd.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sd.dao.entity.AppEntity;

/**
 * @author Vikram
 *
 */
public interface AppEntityRepository extends JpaRepository<AppEntity, Integer>{
	
	AppEntity findByEntityType (String type);

}
