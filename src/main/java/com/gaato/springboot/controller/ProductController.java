package com.gaato.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaato.springboot.model.Product;
import com.gaato.springboot.service.ProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/getProducts")
	public List<Product> getProducts(){ 
		return service.getProducts();
	}

}
