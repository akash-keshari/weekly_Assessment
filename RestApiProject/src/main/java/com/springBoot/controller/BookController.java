package com.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.entities.Book;
import com.springBoot.service.BookSer;

@RestController
public class BookController 
{
	@Autowired
	BookSer bookSer;
	
	@GetMapping("/books")
	public List getBooks()
	{
		List list1=bookSer.getAllBooks();
		
		return list1;
	}
	
	@GetMapping("/book/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		return bookSer.getBookById(id);
	}
	@PostMapping("/books")
	public Book addNewBook(@RequestBody Book book)
	{
		Book book1=this.bookSer.addBook(book);
		return book1;	
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId)
	{
		this.bookSer.bookDelete(bookId);
		
	}
	
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId)
	{
		this.bookSer.updatebook(book, bookId);
		return book;
		
	}
			
}
