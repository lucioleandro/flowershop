package br.com.microservice.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.store.client.SupplierCLient;
import br.com.microservice.store.domain.Order;
import br.com.microservice.store.domain.SupplierInfo;
import br.com.microservice.store.dto.OrderInfoDTO;

@Service
public class BuyService {
	
	@Autowired
	private SupplierCLient client;

	public OrderInfoDTO saveBuy(Order order) {
		SupplierInfo supplierInfo = client.getInfoByState(order.getAddress().getState());
		OrderInfoDTO orderInfo = client.placeOrder(order.getItens());
		System.out.println(supplierInfo.getAddress());
		return orderInfo;
	}

}
