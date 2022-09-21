package com.example.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice

public class GlobalException {
	@ExceptionHandler(InvalidModelNumberException.class)
	public ResponseEntity<String> InvalidModelNumberExceptionHandler(InvalidModelNumberException imn)
	{
		String message = imn.getMessage();
		return new ResponseEntity<>(message,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidClientException.class)
	public ResponseEntity<String> InvalidClientException(InvalidClientException ice)
	{
		String mess = ice.getMessage();
		return new ResponseEntity<>(mess,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidComplaintException.class)
	public ResponseEntity<String> InvalidComplaintException(InvalidComplaintException ice)
	{
		String messa = ice.getMessage();
		return new ResponseEntity<>(messa,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidEngineerException.class)
	public ResponseEntity<String> InvalidEngineerException(InvalidEngineerException ice)
	{
		String messag = ice.getMessage();
		return new ResponseEntity<>(messag,HttpStatus.NOT_FOUND);
	}

}