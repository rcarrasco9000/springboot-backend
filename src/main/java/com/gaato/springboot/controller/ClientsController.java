package com.gaato.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaato.springboot.model.Clients;
import com.gaato.springboot.service.ClientsService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class ClientsController {
	
    // Marks a constructor, field, setter method, or config method as to be autowired bySpring's dependency injection facilities. 
	@Autowired
	private ClientsService service;
	
	@GetMapping("/getClients")
	public List<Clients> getClients() { 
		return service.getClients(); 
	}
	
}
