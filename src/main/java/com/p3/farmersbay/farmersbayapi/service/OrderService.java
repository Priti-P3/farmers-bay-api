package com.p3.farmersbay.farmersbayapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p3.farmersbay.farmersbayapi.dto.PlaceOrderDto;
import com.p3.farmersbay.farmersbayapi.model.Order;
import com.p3.farmersbay.farmersbayapi.model.Product;
import com.p3.farmersbay.farmersbayapi.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductService productService;
	
	public Order placeOrder(PlaceOrderDto orderDetails) {
		Order order = new Order();
		order.setDeliveryAddress(orderDetails.getBillingAddress());
		order.setOrderStatus("PLACED");
		Product product = productService.getProduct(orderDetails.getProductId());
		order.setProduct(product);
		order.setQuantity(orderDetails.getQuantity());
		order.setTotalAmount(orderDetails.getQuantity() * product.getPrice());
		
		order = orderRepository.save(order);
		
		return order;
	}

}
