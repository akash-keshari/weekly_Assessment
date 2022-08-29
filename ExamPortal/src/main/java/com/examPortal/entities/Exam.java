package com.examPortal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exam 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ex_id;
	
	private String course;
	
	private String subject;
	


	public Exam()
	{
		super();
		
	}

	public Exam(long ex_id, String course, String subject) {
		super();
		this.ex_id = ex_id;
		this.course = course;
		this.subject = subject;
	}

	public long getEx_id() {
		return ex_id;
	}

	public void setEx_id(long ex_id) {
		this.ex_id = ex_id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	
}
