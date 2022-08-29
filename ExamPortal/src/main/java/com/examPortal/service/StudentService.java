package com.examPortal.service;

import java.util.List;

import com.examPortal.entities.StaffEntity;
import com.examPortal.entities.StudentEntity;

public interface StudentService
{
	void addData(StudentEntity add);
	List<StudentEntity> getAll();
	void deleteData(Long id);
	StudentEntity updateData(StudentEntity adm,Long id);
}
