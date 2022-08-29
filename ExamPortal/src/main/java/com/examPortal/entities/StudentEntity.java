package com.examPortal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long student_id;
	
	private String name;
	
	private String course;
	
	private String address;
	
	@OneToMany
	private Exam exam;

	public StudentEntity()
	{
		super();
	
	}

	public StudentEntity(long student_id, String name, String course, String address, Exam exam) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.course = course;
		this.address = address;
		this.exam = exam;
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	
}
