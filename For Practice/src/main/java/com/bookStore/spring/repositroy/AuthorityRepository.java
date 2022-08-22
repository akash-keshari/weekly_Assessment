package com.bookStore.spring.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStore.spring.entities.Authority;
import com.bookStore.spring.entities.AuthorityId;

public interface AuthorityRepository extends JpaRepository<Authority, AuthorityId> {

}

