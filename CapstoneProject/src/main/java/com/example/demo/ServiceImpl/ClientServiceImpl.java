package com.example.demo.ServiceImpl;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Complaint;
import com.example.demo.Entities.Engineer;
import com.example.demo.Exceptions.InvalidClientException;
import com.example.demo.Exceptions.InvalidEngineerException;
import com.example.demo.Repository.IClientRepository;
import com.example.demo.Repository.IComplaintRepository;
import com.example.demo.Repository.IEngineerRepository;
import com.example.demo.Service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	IClientRepository clientRepo;

	@Autowired
	IEngineerRepository ier;

	@Autowired
	IComplaintRepository icr;

	@Override
	public void saveClient(Client client) {
		// TODO Auto-generated method stub

		clientRepo.save(client);

	}

	@Override
	public Client getClientByClientId(int clientId) {
		// TODO Auto-generated method stub
		Client cli =this.clientRepo.findById(clientId).orElseThrow(()->new InvalidClientException(clientId));
		return cli;
		
	}

//	@Override
//	public Client getClientByClientId(int clientId) {
//		// TODO Auto-generated method stub
//		return clientRepo.findById(clientId).get();
//
//	}

	@Override
	public Engineer getEngineerById(int engineerId) {
		// TODO Auto-generated method stub
		Engineer eng = ier.findById(engineerId).orElseThrow(()-> new InvalidEngineerException(engineerId));
         return eng;
	}

	@Override
	public List<Engineer> getEngineersByDomain(String domain) {
		// TODO Auto-generated method stub
		return ier.findAllByDomain(domain);

	}

	@Override
	public String changeStatusOfComplaint(int complaintId) {
		// TODO Auto-generated method stub
		Optional<Complaint> com = icr.findById(complaintId);
		if (com.isPresent()) {
			com.get().setStatus("Closed");
			icr.save(com.get());
		}
		return null;
	}

//	@Override
//	public Client signIn(Client signClient)
//	{
//		Client clin=this.clientRepo.signIn(signClient);
//		return clin;
//	}
//
//	@Override
//	public Client signOut(Client signClient)
//	{
//		Client clin=this.clientRepo.signOut(signClient);
//		return clin;
//	}

}
