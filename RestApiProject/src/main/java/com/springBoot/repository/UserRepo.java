package com.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.entities.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity,Long> 
{

}
