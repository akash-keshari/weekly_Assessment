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

import com.assignments.Ecommerce.entity.Merchant;
import com.assignments.Ecommerce.repository.MerchantRepo;

@RestController
@RequestMapping("/merchant")
public class MerchantController {

	@Autowired
	MerchantRepo repo;
	
	@GetMapping("/")
	public List<Merchant> showDetails(){
		
		return repo.findAll();			
	}
	
	@PostMapping("/")
	public List<Merchant> addDetails(@RequestBody Merchant mer){
		
		repo.save(mer);
		return repo.findAll();
	}
	
	@PutMapping("/")
	public List<Merchant> updateDetails(@RequestBody Merchant mer){
		
		repo.save(mer);
		return repo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public List<Merchant> deleteDetails(@PathVariable("id") int id){
		
		repo.deleteById(id);
		return repo.findAll();
	}
	
	
}

