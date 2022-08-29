package com.examPortal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examPortal.entities.AdminEntity;

@Repository
public interface AdminRepo extends JpaRepository<AdminEntity,Long> 
{

}
