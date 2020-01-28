package br.com.microservice.suplier.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.microservice.suplier.domain.SupplierInfo;

public interface SupplierInfoRepository extends JpaRepository<SupplierInfo, Long>{

	Optional<SupplierInfo> findByState(String state);
}
