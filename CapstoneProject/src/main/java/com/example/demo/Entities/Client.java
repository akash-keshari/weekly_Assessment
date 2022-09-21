package com.example.demo.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;
	private String password;
	private String address;
	private long phoneNumber;
	@OneToMany
	private List<Product> product;
	@OneToMany
	private List<Complaint> complaint;

}
