package com.springBoot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springBoot.entities.Book;
import com.springBoot.repository.BookReposit;
@Component
public class BookSer 
{
	Book book=new Book();
	
	@Autowired
	BookReposit bookRepo;
//	private static List<Book> list=new ArrayList();
//	static
//	{
//		list.add(new Book(121,"java","XYZ"));
//		list.add(new Book(131,"Python","ABC"));
//		list.add(new Book(151,".net","PQR"));
//	}
	public List<Book> getAllBooks()
	{		
		List<Book> list=(List<Book>)this.bookRepo.findAll();
		return list;
		
	}
	
	public Book getBookById(int id)
	{
//		Book book=null;
//		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		try
		{
			this.bookRepo.findById(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return book;		
	}
	public Book addBook(Book b)
	{
//		list.add(b);
		Book result=bookRepo.save(b);
		
		return result;
	}
	
	public void bookDelete(int bid)
	{
		//list=list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
		bookRepo.deleteById(bid);
		
	}
	
	public void updatebook(Book book,int bookId)
	{
//		list=list.stream().map(b->
//		{
//			if(b.getId()==bookId)
//			{
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());
		
		book.setId(bookId);
		bookRepo.save(book);
	}
	
}
