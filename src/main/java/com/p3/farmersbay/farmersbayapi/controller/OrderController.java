package com.p3.farmersbay.farmersbayapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p3.farmersbay.farmersbayapi.dto.PlaceOrderDto;
import com.p3.farmersbay.farmersbayapi.model.Order;
import com.p3.farmersbay.farmersbayapi.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("")
	public Order placeOrder(@RequestBody PlaceOrderDto orderDetails) {
		Order order = orderService.placeOrder(orderDetails);
		return order;
	}

}
