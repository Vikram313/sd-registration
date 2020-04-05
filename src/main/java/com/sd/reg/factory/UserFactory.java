/**
 * 
 */
package com.sd.reg.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sd.constant.enums.UserRoleTypeEnum;
import com.sd.reg.behaviour.IUserRoleType;
import com.sd.reg.impl.AdminUser;
import com.sd.reg.impl.GuardianUser;

/**
 * @author Vikram
 *
 */
@Component
public class UserFactory {
	
	@Autowired
	private GuardianUser guardianUser;
	
	@Autowired
	private AdminUser adminUser;
	
	public IUserRoleType getInstance (String userRole) {
		IUserRoleType iUserRoleType = null;
		if (userRole.equalsIgnoreCase(UserRoleTypeEnum.GUARDIAN.toString())) {
			iUserRoleType= guardianUser;
		} else if (userRole.equalsIgnoreCase(UserRoleTypeEnum.ADMIN.toString())) {
			iUserRoleType = adminUser;
		}
		return iUserRoleType;
	}

}
