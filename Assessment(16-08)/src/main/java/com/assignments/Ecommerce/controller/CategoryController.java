package com.assignments.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignments.Ecommerce.entity.Category;
import com.assignments.Ecommerce.repository.CategoryRepo;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryRepo repo;
	
	@GetMapping("/")
	public List<Category> showDetails(){
		
		return repo.findAll();			
	}
	
	@PostMapping("/")
	public List<Category> addDetails(@RequestBody Category cat){
		
		repo.save(cat);
		return repo.findAll();
	}
	
	@PutMapping("/")
	public List<Category> updateDetails(@RequestBody Category cat){
		
		repo.save(cat);
		return repo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public List<Category> deleteDetails(@PathVariable("id") int id){
		
		repo.deleteById(id);
		return repo.findAll();
	}
	
	
}
