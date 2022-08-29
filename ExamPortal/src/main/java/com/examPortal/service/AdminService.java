package com.examPortal.service;

import java.util.List;

import com.examPortal.entities.AdminEntity;

public interface AdminService 
{
	void addData(AdminEntity add);
	List<AdminEntity> getAll();
	void deleteData(Long id);
	AdminEntity updateData(AdminEntity adm,Long id);
}
