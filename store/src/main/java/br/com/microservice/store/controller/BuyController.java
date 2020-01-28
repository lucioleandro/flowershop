package br.com.microservice.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.store.domain.Order;
import br.com.microservice.store.service.BuyService;

@RestController
@RequestMapping("/buy")
public class BuyController {
	
	@Autowired
	private BuyService service;

	@PostMapping
	public void saveBuy(@RequestBody Order order) {
		service.saveBuy(order);
	}
}
