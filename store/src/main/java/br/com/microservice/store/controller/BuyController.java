package br.com.microservice.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.store.domain.Order;
import br.com.microservice.store.dto.OrderInfoDTO;
import br.com.microservice.store.service.BuyService;

@RestController
@RequestMapping("/buy")
public class BuyController {
	
	@Autowired
	private BuyService service;

	@PostMapping
	public OrderInfoDTO saveBuy(@RequestBody Order order) {
		return service.saveBuy(order);
	}
}
