/**
 * 
 */
package com.sd.constant;

/**
 * Class to keep all application constants
 * 
 * @author Vikram
 *
 */
public class SDConstants {

	// Standard codes for application response
	public static final int SD_RESPONSE_CODE_SUCCESS = 200;
	public static final int SD_RESPONSE_CODE_SYSTEM_ERROR = 500;
	public static final int SD_RESPONSE_CODE_NO_DATA_FOUND = -1;
	public static final int SD_RESPONSE_CODE_INVALID_INPUT = -2;

	// Standard messages for application response
	public static final String SD_RESPONSE_MESSAGE_SUCCESS = "success";
	public static final String SD_RESPONSE_MESSAGE_SYSTEM_ERROR = "System internal errror";
	public static final String SD_RESPONSE_MESSAGE_NO_DATA_FOUND = "No data found";
	public static final String SD_RESPONSE_MESSAGE_INVALID_INPUT = "Invalid input";
	public static final String SD_RESPONSE_MESSAGE_NO_STUDENT_FOUND_WITH_PHONE_NUMBER = "NO associated student found registered with given phone number";
	public static final String SD_RESPONSE_MESSAGE_NO_SCHOOL_FOUND = "NO associated school found with given school id";

	// Response Object name in request
	public static final String SD_RESPONSE_OBJECT = "response";

}
