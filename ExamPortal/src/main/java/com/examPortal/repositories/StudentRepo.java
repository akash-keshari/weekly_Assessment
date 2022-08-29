package com.examPortal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examPortal.entities.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Long> 
{

}
