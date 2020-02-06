package br.com.microservice.suplier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.microservice.suplier.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
