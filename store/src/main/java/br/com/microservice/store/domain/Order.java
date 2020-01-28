package br.com.microservice.store.domain;

import java.util.List;

public class Order {

	private List<Item> items;
	private Address address;
	
	public Order(List<Item> itens, Address endereco) {
		this.items = itens;
		this.address = endereco;
	}

	public List<Item> getItens() {
		return items;
	}

	public Address getAddress() {
		return address;
	}
	
}
