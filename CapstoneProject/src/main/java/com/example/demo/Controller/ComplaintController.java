package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.ComplaintDto;
import com.example.demo.Entities.Engineer;
import com.example.demo.Entities.Product;
import com.example.demo.Service.IComplaintService;

import java.util.List;


//import io.swagger.v3.oas.annotations.parameters/.RequestBody;

@RestController
@RequestMapping("/complaint")
public class ComplaintController {


    @Autowired
    private IComplaintService cs;

    @PostMapping("/bookComplaint/")
    String bookComplaint(@RequestBody ComplaintDto complaintdto) {
      Boolean bool= cs.bookComplaint( complaintdto.client,complaintdto.complaint, complaintdto.product,complaintdto.engineer);
      if(bool==true)
      {
    	  return "Complaint booked successfully";
      }
      else
      {
    	  return "Complaint does not book";
      }
    }

    
    @PutMapping("/changeComplStatus/")
    public String changeComplaintStatus(@RequestBody Complaint complaint) {
       return cs.changeComplaintStatus(complaint);
    }

//    @GetMapping("/clientAllComplaint/")
//    public List<Complaint> getClientAllComplaints(@RequestBody Client client) {
//        return cs.getClientAllComplaints( client);
//    }
    @GetMapping("/clientAllComplaint")
    public List<Complaint> getClientAllComplaints(@RequestParam int clientId) {
        return cs.getClientAllComplaints(clientId);
    }

    @GetMapping("/clientAllOpenComplaint")
    public List<Complaint> getClientAllOpenComplaints(@RequestBody Client client) {
        return cs.getClientAllOpenComplaints(client);
    }

    @GetMapping("/getEng")
    public Engineer getEngineer(@RequestHeader int engineerId) {
    	return cs.getEngineer(engineerId);
    }
    
    @GetMapping("/getProdById")
    public Product getProductByComplaint(@RequestParam("complaintId")int complaintId) {
    return cs.getProductByComplaint(complaintId);
    }
}