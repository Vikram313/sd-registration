/**
 * 
 */
package com.sd.reg.behaviour;

import java.util.UUID;

import com.sd.dao.entity.User;
import com.sd.reg.dto.UserDTO;

/**
 * @author Vikram
 *
 */
public interface IUserRoleType {
	
	public User createUser (UserDTO userDto);
	
	/**
	 * Create the new User object
	 * 
	 * @param userDto
	 * @return
	 */
	public default User createUserObject(UserDTO userDto) {
		User user = new User();
		user.setAddress(userDto.getAddress());
		user.setCity(userDto.getCity());
		user.setCountry(userDto.getCountry());
		user.setEmail(userDto.getEmail());
		user.setFisrstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setMiddleName(userDto.getMddleName());
		user.setPassword(userDto.getPassword());
		user.setPhone(userDto.getPhone());
		user.setPostalCode(userDto.getPostalCode());
		user.setState(userDto.getState());
		user.setUserName(userDto.getUserName());
		user.setUuid(UUID.randomUUID().toString());
		user.setStatus("enabled");
		return user;
	}

}