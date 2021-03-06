package com.gaato.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Clients {
		
		@Id
		@GeneratedValue
		private long id;	
		private String name;
		private String email;
		private String phone_number;
		private int client_code;		
}
