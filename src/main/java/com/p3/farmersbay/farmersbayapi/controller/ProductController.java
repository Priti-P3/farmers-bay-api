package com.p3.farmersbay.farmersbayapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.p3.farmersbay.farmersbayapi.model.Product;
import com.p3.farmersbay.farmersbayapi.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id) {
		return productService.getProduct(id);
	}
	
	@GetMapping("")
	public List<Product> getProductsByCategory(@RequestParam(required = false) Long categoryId) {
		return productService.getProductsByCategory(categoryId);
	}

}
