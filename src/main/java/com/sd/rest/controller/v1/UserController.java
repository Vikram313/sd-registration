/**
 * 
 */
package com.sd.rest.controller.v1;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sd.reg.dto.SDResponse;
import com.sd.reg.dto.UserDTO;
import com.sd.rest.service.UserService;

/**
 * @author Vikram
 *
 */
@Controller
@RequestMapping("/sdapi/v1")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	@ResponseBody
	public SDResponse register(HttpServletRequest httpReq, @Valid@RequestBody UserDTO userDto) {
		SDResponse response = (SDResponse) httpReq.getAttribute("response");
		return userService.addUser(userDto, response);
	}

	@RequestMapping(value = "/user/{userName}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public SDResponse getUserByName(HttpServletRequest httpReq, @PathVariable("userName") String userName) {
		SDResponse response = (SDResponse) httpReq.getAttribute("response");
		return userService.getUserByName(userName, response);
	}

}
