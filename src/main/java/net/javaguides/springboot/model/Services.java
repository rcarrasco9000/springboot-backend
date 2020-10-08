package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "services")
public class Services {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "service_name")
	private String service_name;
	
	@Column(name = "service_type")
	private String service_type;
	
	@Column(name = "service_cost")
	private double service_cost;

	public String getService_name() {
		return service_name;
	}

	
	
	public Services(long id, String service_name, String service_type, double service_cost) {
		super();
		this.id = id;
		this.service_name = service_name;
		this.service_type = service_type;
		this.service_cost = service_cost;
	}



	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public double getService_cost() {
		return service_cost;
	}

	public void setService_cost(double service_cost) {
		this.service_cost = service_cost;
	}
	
	
}
