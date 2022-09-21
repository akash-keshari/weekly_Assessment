package com.example.demo.Repository;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface IComplaintRepository extends JpaRepository<Complaint, Integer> {

    List<Complaint> findAllByEngineerAndStatus(Engineer engineer, String status);
    List<Complaint> findAllByEngineerAndStatusAndDate(Engineer engineer, String status, Date date);
    List<Complaint> findAllByProduct(Product product);
    List<Complaint> findAllByClient(Client client);
    
}
