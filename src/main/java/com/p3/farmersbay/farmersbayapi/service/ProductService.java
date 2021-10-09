package com.p3.farmersbay.farmersbayapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p3.farmersbay.farmersbayapi.model.Product;
import com.p3.farmersbay.farmersbayapi.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product getProduct(Long id) {
		Product product = productRepository.getById(id);
		return product;
	}

	public List<Product> getProductsByCategory(Long categoryId) {
		List<Product> products = null;
		if (categoryId == null) {
			products = productRepository.findAll();
		} else {
			products = productRepository.findByCategoryCategoryId(categoryId);
		}
		return products;
	}

}
