package com.examPortal.entities;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AdminEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	
	@OneToMany
	private Course course;
	
	@OneToMany
	private Subject sub;
	
	@OneToMany
	private Stream stream;
	
	@OneToMany
	private StudentEntity student;
	
	@OneToMany
	private StaffEntity staff;
	
	@OneToMany
	private Exam exam;
	

	public AdminEntity() 
	{
		super();
		
	}


	public AdminEntity(long id, String name, Course course, Subject sub, Stream stream, StudentEntity student,
			StaffEntity staff, Exam exam) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.sub = sub;
		this.stream = stream;
		this.student = student;
		this.staff = staff;
		this.exam = exam;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Subject getSub() {
		return sub;
	}


	public void setSub(Subject sub) {
		this.sub = sub;
	}


	public Stream getStream() {
		return stream;
	}


	public void setStream(Stream stream) {
		this.stream = stream;
	}


	public StudentEntity getStudent() {
		return student;
	}


	public void setStudent(StudentEntity student) {
		this.student = student;
	}


	public StaffEntity getStaff() {
		return staff;
	}


	public void setStaff(StaffEntity staff) {
		this.staff = staff;
	}


	public Exam getExam() {
		return exam;
	}


	public void setExam(Exam exam) {
		this.exam = exam;
	}
	  
	

}
