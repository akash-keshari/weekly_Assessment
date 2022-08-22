package com.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springBoot.entities.Book;

public interface BookReposit extends JpaRepository<Book,Integer> 
{
	public Book findById(int id);

}
