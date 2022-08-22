package com.bookStore.spring.services;

import java.util.List;

import com.bookStore.spring.entities.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserByUsername(String username);
}
