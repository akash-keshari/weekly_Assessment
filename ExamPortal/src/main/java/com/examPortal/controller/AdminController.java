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

import com.examPortal.entities.AdminEntity;
import com.examPortal.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController
{
	@Autowired
	AdminService aSer;
	
	@GetMapping("/")
	public List<AdminEntity> getAddD()
	{
		List<AdminEntity> li=this.aSer.getAll();
		return li;
	}
	
	@PostMapping("/")
	public void addDataD(@RequestBody AdminEntity adm)
	{
		this.aSer.addData(adm);
	}
	
	@PutMapping("/{id}")
	public AdminEntity updatData(@RequestBody AdminEntity adm,@PathVariable long id)
	{
	
		return this.aSer.updateData(adm,id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBy(@PathVariable long id)
	{
		this.aSer.deleteData(id);
	}
}
