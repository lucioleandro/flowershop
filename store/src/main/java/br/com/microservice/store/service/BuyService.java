package br.com.microservice.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.microservice.store.domain.Order;
import br.com.microservice.store.domain.SupplierInfo;

@Service
public class BuyService {
	
	@Autowired
	private RestTemplate client;

	public void saveBuy(Order order) {
		ResponseEntity<SupplierInfo> exchange = client.exchange("http://supplier/supplierinfo/" + order.getAddress().getState(), 
				HttpMethod.GET, null, SupplierInfo.class);
		
		System.out.println(exchange.getBody().getAddress());
	}

}
