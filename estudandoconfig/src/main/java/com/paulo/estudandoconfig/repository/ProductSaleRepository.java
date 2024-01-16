package com.paulo.estudandoconfig.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulo.estudandoconfig.model.ProductSale;

@Repository
public interface ProductSaleRepository extends JpaRepository<ProductSale, Long>{

}
