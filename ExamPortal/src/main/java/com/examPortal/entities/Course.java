package com.examPortal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long course_id;
	
	private String course_name;

	public Course() 
	{
		super();
		
	}

	public Course(long course_id, String course_name) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
	}

	public long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	
}
