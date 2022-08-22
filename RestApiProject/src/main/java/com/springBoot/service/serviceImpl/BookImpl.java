package com.springBoot.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springBoot.entities.Book;
import com.springBoot.repository.BookReposit;

@Component
public class BookImpl implements BookSer {
@Autowired
BookReposit br;
	@Override
	public String addbook(Book bk) {
		// TODO Auto-generated method stub
		br.save(bk);
		return "Data added successfully";
	}
@Override
	public List<Book> display() {
		// TODO Auto-generated method stub
		return br.findAll();
		}
@Override
public String update(Book s) {
	// TODO Auto-generated method stub
	br.save(s);
	return "Data Updated";
}
@Override
public String delete(long id) {
	// TODO Auto-generated method stub
	br.deleteById(id);
	return "Data deleted";
}
}