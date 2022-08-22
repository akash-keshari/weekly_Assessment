package com.bookStore.spring.services;

import java.util.Set;

import com.bookStore.spring.entities.Book;
import com.bookStore.spring.entities.Customer;

public interface BookUserService {

	Set<Book> getBooksPurchasedBy(Customer customer);

}

