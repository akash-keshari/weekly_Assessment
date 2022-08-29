package com.examPortal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StaffEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long staff_id;
	
	@OneToMany
	private StudentEntity student_name;

	public StaffEntity() 
	{
		super();
		
	}

	public StaffEntity(long staff_id, StudentEntity student_name) {
		super();
		this.staff_id = staff_id;
		this.student_name = student_name;
	}

	public long getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(long staff_id) {
		this.staff_id = staff_id;
	}

	public StudentEntity getStudent_name() {
		return student_name;
	}

	public void setStudent_name(StudentEntity student_name) {
		this.student_name = student_name;
	}
	
}
