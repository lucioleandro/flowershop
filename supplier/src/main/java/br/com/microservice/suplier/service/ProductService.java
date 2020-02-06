package br.com.microservice.suplier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservice.suplier.domain.Product;
import br.com.microservice.suplier.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> getProdutosPorEstado(String estado) {
		return repository.findByEstado(estado);
	}

	
}
