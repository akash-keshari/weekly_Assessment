package com.assignments.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.Ecommerce.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
