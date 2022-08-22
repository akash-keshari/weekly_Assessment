package com.bookStore.spring.services;

import java.util.Set;

import com.bookStore.spring.entities.Customer;
import com.bookStore.spring.entities.PurchaseDetail;
import com.bookStore.spring.entities.PurchaseHistory;

public interface PaymentService {

	String createTransaction(Customer customer);
	
	Set<PurchaseHistory> getPurchaseHistories(Customer customer);
	
	Set<PurchaseDetail> getPurchaseDetails(PurchaseHistory purchaseHistory);

	PurchaseHistory getPurchaseHistory(Customer customer, String transId);
}

