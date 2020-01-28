package br.com.microservice.suplier.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.suplier.domain.SupplierInfo;
import br.com.microservice.suplier.service.SupplierInfoService;

@RestController
@RequestMapping("/supplierinfo")
public class SupplierInfoController {
	
	@Autowired
	private SupplierInfoService service;

	@GetMapping("/{state}")
	public ResponseEntity<?> getInfoByState(@PathVariable String state) {
		try {
			Optional<SupplierInfo> supplieInfo = service.findByState(state);
			if(supplieInfo.isPresent()) {
				return ResponseEntity.ok().body(supplieInfo.get().getAddress());
			}
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
