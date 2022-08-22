package com.bookStore.spring.services;

import java.util.List;

import com.bookStore.spring.entities.Customer;
import com.bookStore.spring.forms.entity.ChangePassword;
import com.bookStore.spring.forms.entity.CustomerData;

public interface CustomerService {

	public List<Customer> getAllCustomers();
	
	public Customer getCustomer(String username);
		
	public String saveCustomer(Customer theCustomer);
	
	public String updateCustomer(Customer theCustomer);
	
	public String removeCustomer(Customer theCustomer);
	
	public String registerCustomer(CustomerData data);



	public String updateCustomer(CustomerData customerData);
	
	public String updatePassword(ChangePassword changePassword);

	String registerCustomer1(CustomerData data);

	CustomerData getCustomerData(String username);
	
}

