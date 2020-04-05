/**
 * 
 */
package com.sd.reg.exception;

/**
 * @author Vikram
 *
 */
public class UnauthorizedException extends SDCoreException{

	/**
	 */
	private static final long serialVersionUID = 1L;

	
	public UnauthorizedException(int errorCode, String errorMessage, Object data ) {
		super(errorCode, errorMessage, data);
	}
	
	public UnauthorizedException(int errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}
	
	
	public UnauthorizedException(int errorCode, String errorMessage, Throwable exception) {
		super(errorCode, errorMessage, exception);
	}
	
}
