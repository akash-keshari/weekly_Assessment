package com.bookStore.spring.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStore.spring.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
