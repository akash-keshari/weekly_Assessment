package com.example.demo.Exceptions;

public class InvalidModelNumberException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidModelNumberException(int modelId) {
	//	super(String.format("Model Number %d Not found in database ",modelId));
		  super(String.format("Model Number %d is not found in database ", modelId));
		// TODO Auto-generated constructor stub
	}

	
}