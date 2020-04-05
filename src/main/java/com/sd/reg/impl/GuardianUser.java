/**
 * 
 */
package com.sd.reg.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.constant.SDConstants;
import com.sd.constant.enums.UserRoleTypeEnum;
import com.sd.dao.entity.Role;
import com.sd.dao.entity.Student;
import com.sd.dao.entity.User;
import com.sd.dao.entity.UserStudent;
import com.sd.dao.repository.RoleRepository;
import com.sd.dao.repository.StudentRepository;
import com.sd.dao.repository.UserRepository;
import com.sd.dao.repository.UserStudentRepository;
import com.sd.reg.behaviour.IUserRoleType;
import com.sd.reg.dto.UserDTO;
import com.sd.reg.exception.NoDataFoundException;

/**
 * @author Vikram
 *
 */
@Component
public class GuardianUser implements IUserRoleType {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private UserStudentRepository userStudentRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User createUser(UserDTO userDto) {
		User user = null;
		// Fetch all students associated with given phone number
		List<Student> students = studentRepository.findByPhone(userDto.getPhone());
		if (CollectionUtils.isNotEmpty(students)) {
			// Create user object
			user = createUserObject(userDto);

			Role role = roleRepository.findByRoleName(UserRoleTypeEnum.GUARDIAN.toString());
			user.setRoleId(role);

			// Save user object
			user = userRepository.save(user);

			for (Student student : students) {
				// Guardian will only be associated with students
				UserStudent userStudent = new UserStudent();
				userStudent.setStudentId(student);
				userStudent.setUserId(user);
				userStudentRepository.save(userStudent);
			}
		} else {
			throw new NoDataFoundException(SDConstants.SD_RESPONSE_CODE_NO_DATA_FOUND,
					SDConstants.SD_RESPONSE_MESSAGE_NO_STUDENT_FOUND_WITH_PHONE_NUMBER);
		}
		return user;
	}

}
