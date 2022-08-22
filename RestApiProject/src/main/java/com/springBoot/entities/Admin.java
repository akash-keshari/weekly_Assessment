package com.springBoot.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Admin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	String name; 
	@Column
	long phone;
	@ManyToMany(cascade=CascadeType.PERSIST)
	List<Book> us;


	public Admin(long id, String name, long phone, List<Book> us) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.us = us;
		
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public List<Book> getUs() {
		return us;
	}
	public void setUs(List<Book> us) {
		this.us = us;
	}


	@Override
	public String toString() {
		return "admin [id=" + id + ", name=" + name + ", phone=" + phone + ", us=" + us + ", ]";
	}

	
	

}
