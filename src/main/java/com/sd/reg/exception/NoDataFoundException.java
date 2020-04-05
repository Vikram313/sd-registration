/**
 * 
 */
package com.sd.reg.exception;

/**
 * @author Vikram
 *
 */
public class NoDataFoundException extends SDCoreException{

	/**
	 */
	private static final long serialVersionUID = 1L;

	
	public NoDataFoundException(int errorCode, String errorMessage, Object data ) {
		super(errorCode, errorMessage, data);
	}
	
	public NoDataFoundException(int errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}
	
	
	public NoDataFoundException(int errorCode, String errorMessage, Throwable exception) {
		super(errorCode, errorMessage, exception);
	}
	
}
