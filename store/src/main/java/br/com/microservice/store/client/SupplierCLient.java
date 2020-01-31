package br.com.microservice.store.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.microservice.store.domain.SupplierInfo;


@FeignClient("supplier")
public interface SupplierCLient {

	@RequestMapping("/supplierinfo/{state}")
	public SupplierInfo getInfoByState(@PathVariable String state); 
	
}
