package com.examPortal.service;

import java.util.List;

import com.examPortal.entities.AdminEntity;
import com.examPortal.entities.StaffEntity;

public interface StaffService 
{
	void addData(StaffEntity add);
	List<StaffEntity> getAll();
	void deleteData(Long id);
	StaffEntity updateData(StaffEntity adm,Long id);
}
