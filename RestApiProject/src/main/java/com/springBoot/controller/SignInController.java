package com.springBoot.controller;

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

import com.springBoot.entities.SignUp;
import com.springBoot.service.SignSer;

@RestController
@RequestMapping("/signin")
public class SignInController
{


	@Autowired
	SignSer service;

	@GetMapping("/")
	public List<SignUp> details() {
		return service.showdet();
	}

	@PostMapping("/")
	public String adddetails(@RequestBody SignUp s) {
		return service.signin(s);
	}

	@PutMapping("/")
	public String updatedetails(@RequestBody SignUp s) {
		return service.update(s);
	}

	@DeleteMapping("/{id}")

	public String deletedetails(@PathVariable("id") long id) {
		return service.delete(id);
	}
}