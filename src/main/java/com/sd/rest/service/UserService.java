/**
 * 
 */
package com.sd.rest.service;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.constant.SDConstants;
import com.sd.dao.entity.User;
import com.sd.dao.repository.UserRepository;
import com.sd.reg.behaviour.IUserRoleType;
import com.sd.reg.dto.SDResponse;
import com.sd.reg.dto.UserDTO;
import com.sd.reg.exception.NoDataFoundException;
import com.sd.reg.factory.UserFactory;

/**
 * @author Vikram
 *
 */
@Service
public class UserService {

	private static final Logger logger = LogManager.getLogger(UserService.class);

	@Autowired
	private UserFactory userFactory;

	@Autowired
	private UserRepository userRepository;

	/**
	 * Method to add new app user
	 * 
	 * @param userDto
	 * @return
	 */
	public SDResponse addUser(UserDTO userDto, SDResponse response) {
		String userRole = userDto.getRole();
		IUserRoleType userRoleType = userFactory.getInstance(userRole);
		User user = userRoleType.createUser(userDto);
		String registeredUserUuid = user != null ? user.getUuid() : null;
		response.setData(registeredUserUuid);
		return response;
	}

	/**
	 * Method to get User based on useName
	 * 
	 * @param userDto
	 * @return
	 */
	public SDResponse getUserByName(String userName, SDResponse response) {
		UserDTO userDto = null;
		Optional<User> user = userRepository.findByUserName(userName);
		if (user.isPresent()) {
			userDto = new UserDTO();
			BeanUtils.copyProperties(user.get(), userDto);
			response.setData(userDto);
		} else {
			logger.warn("The user " + userName + " is not regitereds");
			throw new NoDataFoundException(SDConstants.SD_RESPONSE_CODE_NO_DATA_FOUND,
					SDConstants.SD_RESPONSE_MESSAGE_NO_DATA_FOUND);
		}
		return response;
	}
}
