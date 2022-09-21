package com.example.demo.ServiceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Entities.Product;
import com.example.demo.Repository.IClientRepository;
import com.example.demo.Repository.IComplaintRepository;
import com.example.demo.Repository.IEngineerRepository;
import com.example.demo.Repository.IProductRepsoitory;
import com.example.demo.Service.IComplaintService;


@Service
public class ComplaintServiceImpl implements IComplaintService
{

	@Autowired
	IComplaintRepository comRepo;

	@Autowired
	IProductRepsoitory ipr;

	@Autowired
	IEngineerRepository ier;
	
	@Autowired
	IClientRepository icr;

	@Override
	public boolean bookComplaint(Client client, Complaint complaint, Product product, Engineer engineer) {
		// TODO Auto-generated method stub
		complaint.setClient(client);
		List<Complaint> comp = new ArrayList<>();
		comp.add(complaint);	
	    client.setComplaint(comp);
	    product.setComplaint(comp);
		complaint.setProduct(product);
		engineer.setComplaint(comp);
	    complaint.setEngineer(engineer);
	    comRepo.save(complaint);
	    ipr.save(product);
	    ier.save(engineer);
	    icr.save(client);
		//comRepo.save(complaint);
		return true;
	}

	@Override
	public String changeComplaintStatus(Complaint complaint) {
		// TODO Auto-generated method stub
		Optional<Complaint> com = comRepo.findById(complaint.getComplaintId());
		if(com.isPresent())
		{
			com.get().setStatus("Close");
			comRepo.save(com.get());
		}
		return null;
	}

//	@Override
//	public List<Complaint> getClientAllComplaints(Client client) {
//		// TODO Auto-generated method stub
//		Optional<Client> cli =icr.findById(client.getClientId());
//		if(cli.isPresent())
//		{
//			return cli.get().getComplaint();
//		}
//		
//		
//		return null;
//	}

	@Override
	public List<Complaint> getClientAllComplaints(int clientId) {
		// TODO Auto-generated method stub
		Optional<Client> cli =icr.findById(clientId);
		if(cli.isPresent())
		{
			return cli.get().getComplaint();
		}
		return null;
		
		
		
	}
	@Override
	public List<Complaint> getClientAllOpenComplaints(Client client) {
		// TODO Auto-generated method stub
		Optional<Client> cli =icr.findById(client.getClientId());
		if(cli.isPresent())
		{
			List<Complaint> complaints= cli.get().getComplaint();
			return complaints.stream().filter(p->p.getStatus().equalsIgnoreCase("open")).collect(Collectors.toList());
		}
		return null;
	}

	@Override
	public Engineer getEngineer(int engineerId) {
		// TODO Auto-generated method stub
	   Engineer en = ier.findById(engineerId).get();
	   Engineer engi =new Engineer();
	   engi.setEngineerId(en.getEngineerId());
	   engi.setEngineerName(en.getEngineerName());
	   engi.setPassword(en.getPassword());
	   engi.setDomain(en.getDomain());
	   return engi;
		
	}

	@Override
	public Product getProductByComplaint(int complaintId) {
		// TODO Auto-generated method stub
		Optional<Complaint> comp =comRepo.findById(complaintId);
		if(comp.isPresent())
		{
			return comp.get().getProduct();
		}
		return null;
	}


}