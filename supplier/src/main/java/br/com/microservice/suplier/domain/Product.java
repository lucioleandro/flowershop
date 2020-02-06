package br.com.microservice.suplier.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String state;
	
	private String description;
	
	private BigDecimal price;
	
	public Product() {}

	public Product(Long id, String name, String state, String description, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.state = state;
		this.description = description;
		this.price = price;
	}

	public Product(String name, String state, String description, BigDecimal price) {
		this.name = name;
		this.state = state;
		this.description = description;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}

	public String getDescription() {
		return description;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	
}
