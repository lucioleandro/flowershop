package br.com.microservice.suplier.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.suplier.domain.SupplierInfo;
import br.com.microservice.suplier.repository.SupplierInfoRepository;

@Service
public class SupplierInfoService {
	
	@Autowired
	private SupplierInfoRepository repository;

	public Optional<SupplierInfo> findByState(String state) {
		return repository.findByState(state);
	}

}
