package com.assignments.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.Ecommerce.entity.Merchant;

public interface MerchantRepo extends JpaRepository<Merchant, Integer> {

}
