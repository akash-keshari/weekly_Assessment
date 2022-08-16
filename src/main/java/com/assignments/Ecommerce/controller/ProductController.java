package com.assignments.Ecommerce.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
import com.assignments.Ecommerce.entity.Merchant;
import com.assignments.Ecommerce.entity.Product;
import com.assignments.Ecommerce.repository.CategoryRepo;
import com.assignments.Ecommerce.repository.MerchantRepo;
import com.assignments.Ecommerce.repository.ProductRepo;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductRepo prodRepo;
	
	@Autowired
	CategoryRepo catRepo;
	
	@Autowired
	MerchantRepo merRepo;
	
	
	@GetMapping("/")
	public List<Product> showDetails(){
		
		return prodRepo.findAll();			
	}
	
	@GetMapping("/prodList/{id}")
	public List<String> showProductByCategoryId(@PathVariable("id") int id){
		
		List<Product> prod = prodRepo.findAll();
		System.out.println(prod);
		
		List<Product> prodName = prod.stream().filter(e -> (e.getCategory().getId()) == id).collect(Collectors.toList());
		
		System.out.println(prodName);
		List<String> name = new ArrayList<>();
		for(Product pro : prodName ) {
			name.add(pro.getName());
		}
		return name;
		
	}
	
	@GetMapping("/prod/{name}")
	public List<String> showProductByCategoryName(@PathVariable("name") String cName){
		
		List<Product> prod = prodRepo.findAll();
		System.out.println(prod);
		
		List<Product> prodName = prod.stream().filter(e -> (e.getCategory().getName()).equalsIgnoreCase(cName)).collect(Collectors.toList());
		
		System.out.println(prodName);
		List<String> name = new ArrayList<>();
		for(Product pro : prodName ) {
			name.add(pro.getName());
		}
		return name;	
	}
	
	@PostMapping("/")
	public List<Product> addDetails(@RequestBody Product prod){
		
		prodRepo.save(prod);
		return prodRepo.findAll();
	}
	
	@PutMapping("/")
	public List<Product> updateDetails(@RequestBody Product prod){
		prodRepo.save(prod);
		return prodRepo.findAll();
	}

	@DeleteMapping("/{id}")
	public List<Product> deleteDetails(@PathVariable("id") int id){
		
		prodRepo.deleteById(id);
		return prodRepo.findAll();
	}
	
	

}
