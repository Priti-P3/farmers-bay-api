package com.p3.farmersbay.farmersbayapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p3.farmersbay.farmersbayapi.model.Category;
import com.p3.farmersbay.farmersbayapi.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getCategories() {
		return categoryRepository.findAll();
	}

}
