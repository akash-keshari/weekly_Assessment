package com.examPortal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examPortal.entities.StaffEntity;

@Repository
public interface StaffRepo extends JpaRepository<StaffEntity,Long> 
{

}
