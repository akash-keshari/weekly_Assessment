package com.example.demo.Entities;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComplaintDto {
	
	public Client client;
	public Complaint complaint;
	public Product product;
	public Engineer engineer;

}
