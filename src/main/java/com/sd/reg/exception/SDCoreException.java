/**
 * 
 */
package com.sd.reg.exception;

/**
 * @author Vikram
 *
 */
public class SDCoreException extends RuntimeException{
	
	private int errorCode;
	
	private String errorMessage;
	
	private Object data;
	
	private Throwable exception;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Blank Constructor
	 */
	public SDCoreException() {
	}
	
	/**
	 *  Exception constructor with params
	 * @param Code
	 * @param message
	 * @param exc
	 */
	public SDCoreException(int errorCode, String errorMessage, Object data) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.data = data;
	}
	
	/**
	 *  Exception constructor with params
	 * @param Code
	 * @param message
	 */
	public SDCoreException(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	
	/**
	 *  Exception constructor with params
	 * @param Code
	 * @param message
	 */
	public SDCoreException(int errorCode, String errorMessage, Throwable exception) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.exception = exception;
	}

	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * @return the exception
	 */
	public Throwable getException() {
		return exception;
	}

	/**
	 * @param exception the exception to set
	 */
	public void setException(Throwable exception) {
		this.exception = exception;
	}
	
	

}
