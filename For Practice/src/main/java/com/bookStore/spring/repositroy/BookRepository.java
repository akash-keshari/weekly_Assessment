package com.bookStore.spring.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bookStore.spring.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	
	@Query("from Book where lower(name) like :search")
	List<Book> searchBooks(@Param("search") String search);

}

