package com.gaato.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaato.springboot.model.Clients;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long>{

}
