package com.assignments.Ecommerce.entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "merchant")
public class Merchant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	long pinCode;
	
	@Column
	String location;
	
	@Column
	long gstNo;

	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Merchant(int id, String name, long pinCode, String location, long gstNo) {
		super();
		this.id = id;
		this.name = name;
		this.pinCode = pinCode;
		this.location = location;
		this.gstNo = gstNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getGstNo() {
		return gstNo;
	}

	public void setGstNo(long gstNo) {
		this.gstNo = gstNo;
	}

	@Override
	public String toString() {
		return "Merchant [id=" + id + ", name=" + name + ", pinCode=" + pinCode + ", location=" + location + ", gstNo="
				+ gstNo + "]";
	}
	
	

}
