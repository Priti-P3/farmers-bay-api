package com.p3.farmersbay.farmersbayapi;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.p3.farmersbay.farmersbayapi.model.Category;
import com.p3.farmersbay.farmersbayapi.model.Product;
import com.p3.farmersbay.farmersbayapi.repository.CategoryRepository;
import com.p3.farmersbay.farmersbayapi.repository.ProductRepository;

@Component
public class AppInitializator {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	private Category category1;
	private Category category2;
	private Category category3;
	
	@PostConstruct
    private void init() {
        insertCategoryData();
        insertProductData();
    }

	private void insertProductData() {
		
		// *****Products data*****
		// Fertilizers data
		Product f1 = new Product();
		f1.setProductName("Organic Super Growth ");
		f1.setAvailable(true);
		f1.setProductImage("https://th.bing.com/th/id/OIP.9fOM3eCwaVC3T9bPaJMGNAHaIx?pid=ImgDet&rs=1");
		f1.setCategory(category1);
		f1.setEnabled(true);
		f1.setPrice(250.00d);
		f1.setProductShortDesc("Katek Naturally Organic Super Growth Fertilizer Pallets, For all Vegetables");
		f1.setQuantity(1);
		f1.setWeight(10.00d);
		f1.setUnit("Kg");
		f1.setDetails("<p>this is <b>first</b> param</p><p>this is <b>second</b> param</p>");
		productRepository.save(f1);
		
		Product f2 = new Product();
		f2.setProductName("Fertilizer 2");
		f2.setAvailable(true);
		f2.setProductImage("https://th.bing.com/th/id/OIP.oYTdKAlsys7xc5By9ETGDwHaEh?pid=ImgDet&rs=1");
		f2.setCategory(category1);
		f2.setEnabled(true);
		f2.setPrice(250.00d);
		f2.setProductShortDesc("Fertilizer 2 desc");
		f2.setQuantity(1);
		f2.setWeight(10.00d);
		f2.setUnit("Kg");
		f2.setDetails("<p>this is <b>first</b> param</p><p>this is <b>second</b> param</p>");
		productRepository.save(f2);
		
		
		// Pesticides data
		Product p1 = new Product();
		p1.setProductName("Pesticide 1");
		p1.setAvailable(true);
		p1.setProductImage("https://th.bing.com/th/id/OIP.9fOM3eCwaVC3T9bPaJMGNAHaIx?pid=ImgDet&rs=1");
		p1.setCategory(category2);
		p1.setEnabled(true);
		p1.setPrice(250.00d);
		p1.setProductShortDesc("Pesticide 1 desc");
		p1.setQuantity(1);
		p1.setWeight(10.00d);
		p1.setUnit("Kg");
		p1.setDetails("<p>this is <b>first</b> param</p><p>this is <b>second</b> param</p>");
		productRepository.save(p1);
		
		Product p2 = new Product();
		p2.setProductName("Pesticide 2");
		p2.setAvailable(true);
		p2.setProductImage("https://th.bing.com/th/id/OIP.oYTdKAlsys7xc5By9ETGDwHaEh?pid=ImgDet&rs=1");
		p2.setCategory(category2);
		p2.setEnabled(true);
		p2.setPrice(250.00d);
		p2.setProductShortDesc("Pesticide 2 desc");
		p2.setQuantity(1);
		p2.setWeight(10.00d);
		p2.setUnit("Kg");
		p2.setDetails("<p>this is <b>first</b> param</p><p>this is <b>second</b> param</p>");
		productRepository.save(p2);
		
		// Seeds data
		Product s1 = new Product();
		s1.setProductName("Seeds 1");
		s1.setAvailable(true);
//		s1.setProductImage("../../assets/products/s1.jpg");
		s1.setProductImage("../../assets/products/s1.jpg");
		s1.setCategory(category3);
		s1.setEnabled(true);
		s1.setPrice(250.00d);
		s1.setProductShortDesc("Seeds 1 desc");
		s1.setQuantity(1);
		s1.setWeight(10.00d);
		s1.setUnit("Kg");
		s1.setDetails("<p>this is <b>first</b> param</p><p>this is <b>second</b> param</p>");
		productRepository.save(s1);
		
		Product s2 = new Product();
		s2.setProductName("Seeds 2");
		s2.setAvailable(true);
		s2.setProductImage("https://th.bing.com/th/id/OIP.oYTdKAlsys7xc5By9ETGDwHaEh?pid=ImgDet&rs=1");
		s2.setCategory(category3);
		s2.setEnabled(true);
		s2.setPrice(250.00d);
		s2.setProductShortDesc("Seeds 2 desc");
		s2.setQuantity(1);
		s2.setWeight(10.00d);
		s2.setUnit("Kg");
		s2.setDetails("<p>this is <b>first</b> param</p><p>this is <b>second</b> param</p>");
		productRepository.save(s2);
	}

	private void insertCategoryData() {
		category1 = new Category("Fertilizers", "All kinds of fertilizers which improve the production", true, "../../assets/icon/fertilizers-1.png");
		category2 = new Category("Pesticides", "All kinds of pestisides which kills bacteria", true, "../../assets/icon/pesticides-1.png");
		category3 = new Category("Seeds", "All kinds of seeds", true, "../../assets/icon/seeds-1.png");
		categoryRepository.saveAll(Arrays.asList(new Category[]{category1, category2, category3}));
	}
}
