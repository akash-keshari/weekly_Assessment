package com.springBoot.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SignUp 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column
	String pass;
	
	@Column
	String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public SignUp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SignUp(String email, long id, String pass) {
		super();
		this.email = email;
		this.id = id;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Signup [email=" + email + ", id=" + id + ", pass=" + pass + "]";
	}
}
