package com.examPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.examPortal.entities.AdminEntity;
import com.examPortal.entities.StaffEntity;
import com.examPortal.repositories.StaffRepo;

public class StaffImpl implements StaffService 
{
	@Autowired
	StaffRepo sRepo;
	@Override
	public void addData(StaffEntity add) 
	{
		this.sRepo.save(add);
	}

	@Override
	public List<StaffEntity> getAll() 
	{
		List<StaffEntity> li=this.sRepo.findAll();
		return li;
	}

	@Override
	public void deleteData(Long id) 
	{
		this.sRepo.deleteById(id);
	}

	@Override
	public StaffEntity updateData(StaffEntity adm, Long id) 
	{
		adm.setStaff_id(id);
		return this.sRepo.save(adm);
	}

}
