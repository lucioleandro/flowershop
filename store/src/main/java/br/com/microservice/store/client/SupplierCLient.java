package br.com.microservice.store.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.microservice.store.domain.Item;
import br.com.microservice.store.domain.SupplierInfo;
import br.com.microservice.store.dto.OrderInfoDTO;


@FeignClient("supplier")
public interface SupplierCLient {

	@RequestMapping("/supplierinfo/{state}")
	public SupplierInfo getInfoByState(@PathVariable String state);

	@PostMapping("/pedido")
	public OrderInfoDTO placeOrder(List<Item> itens); 
	
}
