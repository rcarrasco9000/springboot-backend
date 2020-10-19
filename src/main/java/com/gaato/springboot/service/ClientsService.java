package com.gaato.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaato.springboot.model.Clients;
import com.gaato.springboot.repository.ClientsRepository;

@Service
public class ClientsService {
	
	@Autowired
	private ClientsRepository repository;
	
	public List<Clients> getClients() { return repository.findAll(); } 
}
