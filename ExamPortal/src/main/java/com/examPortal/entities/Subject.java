package com.examPortal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long subject_id;
	
	private String subject_name;

	public Subject() 
	{
		super();
	
	}

	public Subject(long subject_id, String subject_name) {
		super();
		this.subject_id = subject_id;
		this.subject_name = subject_name;
	}

	public long getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(long subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	
}


