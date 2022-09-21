package com.example.demo.Exceptions;

public class InvalidComplaintException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidComplaintException(int complaintId)
	{
		super(String.format("Complaint Number %d is not found in database ", complaintId));
	}
	

}
