package com.gaato.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gaato.springboot.model.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long>{

}
