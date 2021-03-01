package com.users.microservice.exceptions;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomException(String msn) {
		super(msn);
	}

}
