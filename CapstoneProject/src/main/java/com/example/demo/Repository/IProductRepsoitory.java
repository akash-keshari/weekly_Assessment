package com.example.demo.Repository;

import com.example.demo.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IProductRepsoitory extends JpaRepository<Product, Integer> {
}
