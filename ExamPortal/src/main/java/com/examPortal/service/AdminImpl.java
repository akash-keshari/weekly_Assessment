package com.examPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examPortal.entities.AdminEntity;
import com.examPortal.repositories.AdminRepo;

@Service
public class AdminImpl implements AdminService
{

	@Autowired
	AdminRepo adRepo;
	
	@Override
	public void addData(AdminEntity add) 
	{
		this.adRepo.save(add);
		
	}

	@Override
	public List<AdminEntity> getAll() 
	{
		List<AdminEntity> li=this.adRepo.findAll();
		return li;
	}

	@Override
	public void deleteData(Long id) 
	{
		this.adRepo.deleteById(id);
	}

	@Override
	public AdminEntity updateData(AdminEntity adm, Long id) 
	{
		adm.setId(id);
		return adm;
	}

}
