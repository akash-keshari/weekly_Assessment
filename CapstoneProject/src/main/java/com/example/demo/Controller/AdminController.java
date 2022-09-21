package com.example.demo.Controller;

import com.example.demo.Entities.Complaint;
//import com.cg.service.IAdminService;
import com.example.demo.Entities.Engineer;
import com.example.demo.Service.IAdminService;
import com.example.demo.Service.IEngineerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AdminController {

   @Autowired
   private IAdminService ids;
   

    @PostMapping("/admin/addeng")
    public String addEngineer(@RequestBody Engineer engineer) {
    	ids.addEngineer(engineer);
    	return "Engineer added successfully";
    }


    @PutMapping("admin/changedomain")
    public String changeADomain(@RequestParam("id") int id,@RequestParam("domain") String domain) {
      ids.changeDomain(id,domain);
      return "Domain changed successfully";
    }
    
    
    @DeleteMapping("/admin/removeeng")
    public String removeEngineer(@RequestParam("engineerId")int engineerId) {
      ids.removeEngineer(engineerId);    
      return "Engineer remove successfully";
    }
    
    @GetMapping("/admin/getCom")
    public List<Complaint> getComplaintsByProduct(@RequestParam("product")int product) {
    	return ids.getComplaintsByProduct(product);
    }
    
    @GetMapping("/admin/getCombyID")
    public List<Complaint> getComplaints(@RequestParam("clientId")int clientId) {
    	return ids.getComplaints(clientId);
    }
    
    @PutMapping("/admin/replaceEng")
    Complaint replaceEngineerFromComaplaint(@RequestParam("complaintId")int complaintId,@RequestParam("engineerId") int engineerId) {
    	return ids.replaceEngineerFromComaplaint(complaintId, engineerId);
    }
    
}
    
    
    
    
    
    
   