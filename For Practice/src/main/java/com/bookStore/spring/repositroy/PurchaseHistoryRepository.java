package com.bookStore.spring.repositroy;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookStore.spring.entities.Customer;
import com.bookStore.spring.entities.PurchaseHistory;

public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, String> {

	@Query("from PurchaseHistory where customer = ?1")
	Set<PurchaseHistory> findAllByCustomer(Customer customer);

}

