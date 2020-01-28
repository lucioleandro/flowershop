package br.com.microservice.suplier.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SupplierInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String company;
	private String tradeName;
	private String state;
	private String address;
	
	public SupplierInfo(Long id, String company, String tradeName, String state, String address) {
		this.id = id;
		this.company = company;
		this.tradeName = tradeName;
		this.state = state;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public String getCompany() {
		return company;
	}

	public String getTradeName() {
		return tradeName;
	}

	public String getState() {
		return state;
	}

	public String getAddress() {
		return address;
	}

}
