package com.examPortal.controller;

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

import com.examPortal.entities.StudentEntity;
import com.examPortal.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController
{
	@Autowired
	StudentService sSt;
	
	@GetMapping("/")
	public List<StudentEntity> getData()
	{
		List<StudentEntity> li=this.sSt.getAll();
		return li;
	}
	
	@PostMapping("/")
	public void addData(@RequestBody StudentEntity st)
	{
		 this.sSt.addData(st);
	}
	
	@PutMapping("/{id}")
	public StudentEntity updatDa(@RequestBody StudentEntity st,@PathVariable long id)
	{
		StudentEntity st1=this.sSt.updateData(st, id);
		return st1;
	}
	@DeleteMapping("/{id}")
	public void deleteByI(@PathVariable long id)
	{
		this.sSt.deleteData(id);
	}
}

