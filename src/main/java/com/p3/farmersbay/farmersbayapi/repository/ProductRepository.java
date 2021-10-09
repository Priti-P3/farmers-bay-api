package com.p3.farmersbay.farmersbayapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p3.farmersbay.farmersbayapi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	List<Product> findByCategoryCategoryId(Long categoryId);

}
