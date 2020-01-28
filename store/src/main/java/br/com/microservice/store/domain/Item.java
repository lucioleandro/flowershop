package br.com.microservice.store.domain;

public class Item {
	
	private Long id;
	private Long quantity;
	
	public Item(Long id, Long quantidade) {
		this.id = id;
		this.quantity = quantidade;
	}

	public Long getId() {
		return id;
	}

	public Long getQuantidade() {
		return quantity;
	}
	
}
