package br.com.microservice.suplier.dto;

public class OrderItemDTO {

	private long id;
	
	private int quantity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantidade) {
		this.quantity = quantidade;
	}
	
}
