package com.assignments.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.Ecommerce.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
