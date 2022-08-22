package com.bookStore.spring.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bookStore.spring.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

	
	@Query("from Customer where lower(email)=:email_id")
	public List<Customer> findByEmail(@Param("email_id") String emailId);
}
