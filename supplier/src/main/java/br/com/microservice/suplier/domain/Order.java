package br.com.microservice.suplier.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer preparationTime;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedidoId")
	private List<OrderItem> itens;
	
	public Order(List<OrderItem> itens) {
		this.itens = itens;
		this.status = OrderStatus.RECEBIDO;
	}
	
	public Order() {
	}

	public Long getId() {
		return id;
	}

	public Integer getPreparationTime() {
		return preparationTime;
	}
	
	public void setPreparationTime(Integer preparationTime) {
		this.preparationTime = preparationTime;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public List<OrderItem> getItens() {
		return itens;
	}
	
}
