package br.com.microservice.suplier.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.suplier.domain.Order;
import br.com.microservice.suplier.domain.OrderItem;
import br.com.microservice.suplier.domain.Product;
import br.com.microservice.suplier.dto.OrderItemDTO;
import br.com.microservice.suplier.repository.OrderRepository;
import br.com.microservice.suplier.repository.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public Order placeOrder(List<OrderItemDTO> items) {
		
		if(items == null) {
			return null;
		}
		
		List<OrderItem> orderItems = toOrderItem(items);
		Order order = new Order(orderItems);
		order.setPreparationTime(items.size());
		return orderRepository.save(order);
	}
	
	public Order getOrderById(Long id) {
		return this.orderRepository.findById(id).orElse(new Order());
	}

	private List<OrderItem> toOrderItem(List<OrderItemDTO> items) {
		
		List<Long> productsIds = items
				.stream()
				.map(item -> item.getId())
				.collect(Collectors.toList());
		
		List<Product> orderProducts = productRepository.findByIdIn(productsIds);
		
		List<OrderItem> orderItems = items
			.stream()
			.map(item -> {
				Product product = orderProducts
						.stream()
						.filter(p -> p.getId() == item.getId())
						.findFirst().get();
				
				OrderItem orderItem = new OrderItem();
				orderItem.setProuct(product);
				orderItem.setQuantity(item.getQuantity());
				return orderItem;
			})
			.collect(Collectors.toList());
		return orderItems;
	}
}
