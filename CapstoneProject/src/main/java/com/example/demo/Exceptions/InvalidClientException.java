package com.example.demo.Exceptions;

public class InvalidClientException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidClientException(int clientID) {
		super(String.format("Client Number %d is not found in database", clientID));

	}

}
