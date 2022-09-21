package com.example.demo.ServiceImpl;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Entities.Product;
import com.example.demo.Repository.IAdminRepository;
import com.example.demo.Repository.IClientRepository;
import com.example.demo.Repository.IComplaintRepository;
import com.example.demo.Repository.IEngineerRepository;
import com.example.demo.Repository.IProductRepsoitory;
import com.example.demo.Service.IAdminService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class AdminServiceImpl implements IAdminService {
	@Autowired
	IEngineerRepository engineerRepository;

	@Autowired
	IAdminRepository adminRepository;

	@Autowired
	IComplaintRepository complaintRepository;

	@Autowired
	IProductRepsoitory productRepository;

	@Autowired
	IClientRepository clientRepository;

	@Override
	public void addEngineer(Engineer engineer) {
		engineerRepository.save(engineer);

	}

	@Override
	public void changeDomain(int id, String domain) {
		// TODO Auto-generated method stub

		Optional<Engineer> eng = engineerRepository.findById(id);
		if (eng.isPresent()) {
			eng.get().setDomain(domain);
			engineerRepository.save(eng.get());
		}

	}

	@Override
	public void removeEngineer(int engineerId) {
		// TODO Auto-generated method stub
		engineerRepository.deleteById(engineerId);
		

	}

	@Override
	public List<Complaint> getComplaintsByProduct(int product) {
		// TODO Auto-generated method stub
		Optional<Product> prod = productRepository.findById(product);
		if (prod.isPresent()) {
			return complaintRepository.findAllByProduct(prod.get());
		}

		return null;
	}

	@Override
	public List<Complaint> getComplaints(int clientId) {
		// TODO Auto-generated method stub
		Optional<Client> cl = clientRepository.findById(clientId);
		if (cl.isPresent()) {
			return complaintRepository.findAllByClient(cl.get());
		}

		return null;
	}

	@Override
	public Complaint replaceEngineerFromComaplaint(int complaintId, int engineerId) {
		// TODO Auto-generated method stub

		Optional<Complaint> com = complaintRepository.findById(complaintId);
		Optional<Engineer> eng = engineerRepository.findById(engineerId);
		if(com.isPresent()&& eng.isPresent())
		{
			List<Complaint> comp = new ArrayList<>();
			comp.add(com.get());
			eng.get().setComplaint(comp);
			engineerRepository.save(eng.get());
			com.get().setEngineer(eng.get());
			complaintRepository.save(com.get());
		}
		return null;
	}

}