package com.example.demo.Service;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IComplaintService {

    boolean bookComplaint(Client client, Complaint complaint, Product product, Engineer engineer);

    String changeComplaintStatus(Complaint complaint);

   // List<Complaint> getClientAllComplaints(Client client);
    
	List<Complaint> getClientAllComplaints(int clientId);


    List<Complaint> getClientAllOpenComplaints(Client client);

    Engineer getEngineer(int engineerId);


    Product getProductByComplaint(int complaintId);


}
