package com.example.demo.ServiceImpl;

import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Exceptions.InvalidComplaintException;
import com.example.demo.Repository.IComplaintRepository;
import com.example.demo.Repository.IEngineerRepository;
import com.example.demo.Service.IEngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class EngineerServiceImpl implements IEngineerService {

    @Autowired
    IEngineerRepository engineerRepository;

    @Autowired
    IComplaintRepository complaintRepository;

    @Override
    public List<Complaint> getAllOpenComplaints(Engineer engineer) {
        return complaintRepository.findAllByEngineerAndStatus(engineer, "open");
    }

    @Override
    public List<Complaint> getAllResolvedComplaints(Engineer engineer) {
        return complaintRepository.findAllByEngineerAndStatus(engineer, "closed");
    }

    @Override
    public List<Complaint> getAllResolvedComplaintsByDate(Engineer engineer, Date date) {
        return complaintRepository.findAllByEngineerAndStatusAndDate(engineer, "closed", date);
    }

    @Override
    public Complaint getComplaints( Integer complaintsId) {
        Complaint comp = this.complaintRepository.findById(complaintsId).orElseThrow(()->new InvalidComplaintException(complaintsId));
        return comp;
    }

    @Override
    public void changeComplaintStatus(Integer id) {
        Optional<Complaint> complaint = complaintRepository.findById(id);
        if(complaint.isPresent()){
            complaint.get().setStatus("closed");
            complaintRepository.save(complaint.get());
        }
    }
}
