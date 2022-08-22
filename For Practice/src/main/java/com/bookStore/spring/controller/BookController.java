package com.bookStore.spring.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookStore.spring.entities.Book;
import com.bookStore.spring.entities.CurrentSession;
import com.bookStore.spring.entities.Customer;
import com.bookStore.spring.entities.ShoppingCart;
import com.bookStore.spring.services.BookService;
import com.bookStore.spring.services.ShoppingCartService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService theBookService;

	
	@GetMapping({"","/"})
	public Set<Book> viewBooks()
	{
		//load the books
		Set<Book> books = theBookService.getAllBooks(); 	
		
		return books;
	}
	
}
	


