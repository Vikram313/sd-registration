/**
 * 
 */
package com.sd.reg.dto;

/**
 * @author Vikram
 *
 */
public class SDResponse {
	
	private int code;
	private String message;
	private Object data;
	
	//Blank Constructor
	public SDResponse() {
	}
	
	//Constructor to create response object
		public SDResponse(int code, String message) {
			this.code = code;
			this.message = message;
		}
	
	//Constructor to create response object
	public SDResponse(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SDResponse [code=");
		builder.append(code);
		builder.append(", message=");
		builder.append(message);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}
}
