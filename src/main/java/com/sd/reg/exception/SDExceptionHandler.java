/**
 * 
 */
package com.sd.reg.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sd.reg.dto.SDResponse;

/**
 * @author Vikram
 *
 */
@ControllerAdvice
public class SDExceptionHandler {
	
	  @ExceptionHandler({UnauthorizedException.class})
	  public @ResponseBody SDResponse handleSDTokenException(
	      HttpServletRequest requset, HttpServletResponse response, Exception e) {
		  SDResponse sdResponse = new SDResponse();
	    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	    sdResponse.setCode(401);
	    sdResponse.setMessage("Uauthorized");
	    sdResponse.setData(null);
	    return sdResponse;
	  }
}
