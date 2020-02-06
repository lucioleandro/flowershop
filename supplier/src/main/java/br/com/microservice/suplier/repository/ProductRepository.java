package br.com.microservice.suplier.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.microservice.suplier.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findByState(String estado);
	
	List<Product> findByIdIn(List<Long> ids);
}
