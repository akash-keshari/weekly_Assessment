package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Service.IEngineerService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;


@RestController
public class EngineerController {


    @Autowired
    private IEngineerService eng;

    @GetMapping("/engineer/openComp")
    public List<Complaint> getallopenComplaints(@RequestBody Engineer engineer) {
        return eng.getAllOpenComplaints(engineer);
    }


   @GetMapping("/engineer/closeComp")
   public List<Complaint> getallcloseComplaints(@RequestBody Engineer engineer) {
       return eng.getAllResolvedComplaints(engineer);
   }
   
   
   @GetMapping("/engineer/resolvebydate")
    public List<Complaint> getresolveSortedComplaints(@RequestBody Engineer engineer,@RequestParam("date")String date) throws ParseException {
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	   Date ld =formatter.parse(date);
      return eng.getAllResolvedComplaintsByDate(engineer, ld);

    }
   
   @GetMapping("/engineer/allComp")
   public Complaint getComplaints(@RequestParam("complaintsId") Integer complaintsId) {
	return eng.getComplaints(complaintsId);
}
}
