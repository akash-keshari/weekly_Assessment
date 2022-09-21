package com.example.demo.Service;

import com.example.demo.Entities.Client;
import com.example.demo.Entities.Engineer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IClientService {
    void saveClient(Client client);

    Client getClientByClientId(int clientId);

    Engineer getEngineerById(int engineerId);

    List<Engineer> getEngineersByDomain(String domain);

	String changeStatusOfComplaint(int complaintId);
	
	
	
//	Client signIn(Client signClient);
//	
//	Client signOut(Client signClient);


}
