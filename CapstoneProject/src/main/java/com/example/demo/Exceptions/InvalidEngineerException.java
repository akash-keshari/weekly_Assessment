package com.example.demo.Exceptions;

public class InvalidEngineerException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidEngineerException(int engineerID) {
	//	super(String.format("Model Number %d Not found in database ",modelId));
		  super(String.format("Engineer %d is not found in database ", engineerID));
		// TODO Auto-generated constructor stub
	}

	

}
