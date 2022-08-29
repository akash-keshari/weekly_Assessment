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

import com.examPortal.entities.StaffEntity;
import com.examPortal.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController 
{
	@Autowired
	StaffService sSer;
	
	@GetMapping("/")
	public List<StaffEntity> getAllD()
	{
		List<StaffEntity> li=this.sSer.getAll();
		return li;
	}
	@PostMapping("/")
	public void addDataD(@RequestBody StaffEntity sf)
	{
		this.sSer.addData(sf);
	}
	
	@PutMapping("/{id}")
	public StaffEntity updateDat(@RequestBody StaffEntity sf,@PathVariable long id)
	{
		return this.sSer.updateData(sf, id);
	}
	
	@DeleteMapping("{id}")
	public void deleteByI(@PathVariable long  id)
	{
		this.sSer.deleteData(id);
	}
}
