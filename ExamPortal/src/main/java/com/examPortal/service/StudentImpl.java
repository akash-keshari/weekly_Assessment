package com.examPortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.examPortal.entities.StudentEntity;
import com.examPortal.repositories.StudentRepo;

public class StudentImpl implements StudentService
{

	@Autowired
	StudentRepo sRepo;
	@Override
	public void addData(StudentEntity add)
	{
		this.sRepo.save(add);		
	}

	@Override
	public List<StudentEntity> getAll() 
	{
		List<StudentEntity> li=this.sRepo.findAll();
		return li;
	}

	@Override
	public void deleteData(Long id) 
	{
		this.sRepo.deleteById(id);	
	}

	@Override
	public StudentEntity updateData(StudentEntity adm, Long id) 
	{
		adm.setStudent_id(id);
		return this.sRepo.save(adm);
	}

}
