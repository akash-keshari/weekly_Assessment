package com.example.demo.Repository;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Complaint;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {
	
	//List<Complaint> findComplaintByClient_Complaint(int clientId);
	

}
