/**
 * 
 */
package com.sd.rest.service;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.constant.enums.EntityTypeEnum;
import com.sd.dao.entity.AppEntity;
import com.sd.dao.entity.UserSchool;
import com.sd.dao.repository.AppEntityRepository;
import com.sd.dao.repository.UserSchoolRepository;

/**
 * @author Vikram
 *
 */
@Service
public class AppEntityService {

	@Autowired
	private AppEntityRepository appEntityRepository;

	@Autowired
	private UserSchoolRepository userSchoolRepository;

	/**
	 * Method to get the app entity
	 * 
	 * @param type
	 * @return
	 */
	public AppEntity getAppEntity(String type) {
		AppEntity tenantEntity = null;
		if (type != null) {
			tenantEntity = new AppEntity();
			tenantEntity.setEntityType(type);
			tenantEntity = appEntityRepository.save(tenantEntity);
		}
		return tenantEntity;
	}
}
