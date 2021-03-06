/**
 * 
 */
package com.sd.reg.exception;

/**
 * @author Vikram
 *
 */
public class InvalidInputException extends SDCoreException{

	/**
	 */
	private static final long serialVersionUID = 1L;

	
	public InvalidInputException(int errorCode, String errorMessage, Object data ) {
		super(errorCode, errorMessage, data);
	}
	
	public InvalidInputException(int errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}
	
	
	public InvalidInputException(int errorCode, String errorMessage, Throwable exception) {
		super(errorCode, errorMessage, exception);
	}
	
}
