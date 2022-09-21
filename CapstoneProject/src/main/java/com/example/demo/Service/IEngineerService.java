package com.example.demo.Service;

import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public interface IEngineerService {

    List<Complaint> getAllOpenComplaints(Engineer engineer);

    List<Complaint> getAllResolvedComplaints(Engineer engineer);

    List<Complaint> getAllResolvedComplaintsByDate(Engineer engineer, Date date);

    Complaint getComplaints( Integer complaintsId);

    void changeComplaintStatus(Integer id);


}
