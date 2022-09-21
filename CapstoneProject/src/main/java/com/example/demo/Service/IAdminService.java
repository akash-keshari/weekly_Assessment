package com.example.demo.Service;

import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IAdminService {
    void addEngineer(Engineer engineer);

    void changeDomain(int id, String domain);

    void removeEngineer(int engineerId);

    List<Complaint> getComplaintsByProduct(int product);

    List<Complaint> getComplaints(int clientId);

    Complaint replaceEngineerFromComaplaint(int complaintId, int engineerId);
}

