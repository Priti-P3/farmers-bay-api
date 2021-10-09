package com.p3.farmersbay.farmersbayapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p3.farmersbay.farmersbayapi.model.Category;
import com.p3.farmersbay.farmersbayapi.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping()
	public List<Category> getCategories() {
		return categoryService.getCategories();
	}
	
}
