/**
 * 
 */
package com.sd.reg.impl;

import java.util.Optional;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.constant.SDConstants;
import com.sd.constant.enums.UserRoleTypeEnum;
import com.sd.dao.entity.Role;
import com.sd.dao.entity.School;
import com.sd.dao.entity.User;
import com.sd.dao.entity.UserSchool;
import com.sd.dao.repository.RoleRepository;
import com.sd.dao.repository.SchoolRepository;
import com.sd.dao.repository.UserRepository;
import com.sd.dao.repository.UserSchoolRepository;
import com.sd.reg.behaviour.IUserRoleType;
import com.sd.reg.dto.UserDTO;
import com.sd.reg.exception.InvalidInputException;
import com.sd.reg.exception.NoDataFoundException;

/**
 * @author OGS
 *
 */
@Component
public class AdminUser implements IUserRoleType {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private SchoolRepository schoolRepository;

	@Autowired
	private UserSchoolRepository userSchoolRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User createUser(UserDTO userDto) {

		User user = null;
		// Admin will only be associated with one School

		if (StringUtils.isNotBlank(userDto.getSchoolId())) {
			Optional<School> school = schoolRepository.findById(Integer.parseInt(userDto.getSchoolId()));
			if (school.isPresent()) {
				// Create user object
				user = createUserObject(userDto);

				Role role = roleRepository.findByRoleName(UserRoleTypeEnum.ADMIN.toString());
				user.setRoleId(role);

				// Save user object
				user = userRepository.save(user);
				UserSchool userSchool = new UserSchool();
				userSchool.setSchoolId(school.get());
				userSchool.setUserId(user);
				userSchoolRepository.save(userSchool);
			} else {
				throw new NoDataFoundException(SDConstants.SD_RESPONSE_CODE_NO_DATA_FOUND,
						SDConstants.SD_RESPONSE_MESSAGE_NO_SCHOOL_FOUND);
			}
		} else {
			throw new InvalidInputException(SDConstants.SD_RESPONSE_CODE_INVALID_INPUT,
					SDConstants.SD_RESPONSE_MESSAGE_INVALID_INPUT);
		}
		return user;
	}

}
