package com.springBoot.service;

import java.util.List;

import com.springBoot.entities.SignUp;

public interface SignSer 
{

	public String signin(SignUp s);
	public List<SignUp> showdet();
	public String update(SignUp s);
	public String delete(long id);
}