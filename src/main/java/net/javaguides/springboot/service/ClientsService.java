package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Clients;
import net.javaguides.springboot.repository.ClientsRepository;

@Service
public class ClientsService {
	
	@Autowired
	private ClientsRepository repository;
	
	public List<Clients> getClients() { return repository.findAll(); } 
}
