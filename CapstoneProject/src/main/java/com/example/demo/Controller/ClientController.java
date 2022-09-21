package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entities.Engineer;
import com.example.demo.Service.IClientService;

//import ch.qos.logback.core.net.server.Client;
import com.example.demo.Entities.Client;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    IClientService cl;

    @PostMapping("/client/saveClient")
    public String saveClient(@RequestBody Client client) {
        cl.saveClient(client);
        return "Client saved successfully";
    }

    @GetMapping("/client/getClientId")
    public ResponseEntity<Client> getClientByCLientId(@RequestParam("clientID") int clientId) {
    	return new ResponseEntity<>(cl.getClientByClientId(clientId),HttpStatus.OK);
    }

//    @GetMapping("/client/getClientId")
//    public Client getClientByCLientId(@RequestParam("clientID") int clientId) {
//    	return cl.getClientByClientId(clientId);
//    }
    	
    @GetMapping("/client/getEngineerId")
    public Engineer getEngineerById(@RequestParam("engineerId") int engineerId) {
        return cl.getEngineerById(engineerId);
    }

    @GetMapping("/client/getEngineerDom")
    public List<Engineer> getEngineerByDomain(@RequestParam("domain") String domain) {
        return cl.getEngineersByDomain(domain);
    }


}