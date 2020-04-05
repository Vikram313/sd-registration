/**
 * 
 */
package com.sd.reg.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.sd.constant.SDConstants;
import com.sd.reg.dto.SDResponse;

/**
 * @author Vikram
 *
 */
@Component
public class AppFilter implements Filter {
	
	Logger logger = LogManager.getLogger(AppFilter.class);

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) req;
		HttpServletResponse httpRes = (HttpServletResponse) res;
		logger.info("Request local address :- " + httpReq.getLocalAddr());
		logger.info("Request remote host :- " + httpReq.getRemoteHost());
		SDResponse sdResponse = new SDResponse(SDConstants.SD_RESPONSE_CODE_SUCCESS,
				SDConstants.SD_RESPONSE_MESSAGE_SUCCESS);
		req.setAttribute(SDConstants.SD_RESPONSE_OBJECT, sdResponse);
		filterChain.doFilter(httpReq, httpRes);
	}

	@Override
	public void init(FilterConfig filterconfig) throws ServletException {
	}

}
