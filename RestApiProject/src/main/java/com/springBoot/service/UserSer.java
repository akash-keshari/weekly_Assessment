package com.springBoot.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springBoot.entities.UserEntity;

@Component
public interface UserSer 
{



public String sucessSignin(long id,String email,String pass);
public String use(UserEntity s);
public List<UserEntity> showdet();
public String update(UserEntity s);
public String delete(long id);
}