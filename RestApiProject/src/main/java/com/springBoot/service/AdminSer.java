package com.springBoot.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springBoot.entities.Admin;

@Component
public interface AdminSer
{

	public String admi(Admin s);
	public List<Admin> showdet();
	public String update(Admin s);
	public String delete(long id);
	public String sucessSignin(long id,String email,String pass);
}