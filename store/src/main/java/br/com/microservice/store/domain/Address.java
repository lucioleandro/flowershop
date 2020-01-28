package br.com.microservice.store.domain;

public class Address {

	private String street;
	private String number;
	private String state;
	
	public Address(String street, String number, String state) {
		this.street = street;
		this.number = number;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public String getNumber() {
		return number;
	}

	public String getState() {
		return state;
	}
	
}
