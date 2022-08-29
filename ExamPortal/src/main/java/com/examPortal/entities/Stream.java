package com.examPortal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Stream 
{
	
	private String stream_name;

	public Stream() {
		super();
		
	}

	public Stream(String stream_name) {
		super();
		this.stream_name = stream_name;
	}

	public String getStream_name() {
		return stream_name;
	}

	public void setStream_name(String stream_name) {
		this.stream_name = stream_name;
	}
	
	
}
