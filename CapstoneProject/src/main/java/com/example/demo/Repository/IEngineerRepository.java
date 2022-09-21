package com.example.demo.Repository;

import com.example.demo.Entities.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEngineerRepository extends JpaRepository<Engineer, Integer> {
	
	List<Engineer> findAllByDomain(String domain);
}