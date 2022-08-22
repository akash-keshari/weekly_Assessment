package com.bookStore.spring.repositroy;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookStore.spring.entities.PurchaseDetail;
import com.bookStore.spring.entities.PurchaseDetailId;
import com.bookStore.spring.entities.PurchaseHistory;

public interface PurchaseDetailRepository extends JpaRepository<PurchaseDetail, PurchaseDetailId> {

	
	@Query("from PurchaseDetail where purchaseHistory = ?1")
	Set<PurchaseDetail> findAllByHistory(PurchaseHistory purchaseHistory);

}

