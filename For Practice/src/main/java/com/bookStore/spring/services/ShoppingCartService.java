package com.bookStore.spring.services;

import java.util.Set;

import com.bookStore.spring.entities.Book;
import com.bookStore.spring.entities.Customer;
import com.bookStore.spring.entities.ShoppingCart;

public interface ShoppingCartService {

	public Set<ShoppingCart> getAllItems(Customer customer);
		
	public String addItem(Customer customer, Book book);

	public String increaseItem(Customer customer, Book book, int count);
	
	public String removeItem(Customer customer, Book book);

	String decreaseItem(Customer customer, Book book, int count);

	public Set<ShoppingCart> getByUsername(Customer customer);
	
}

