package com.p3.farmersbay.farmersbayapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p3.farmersbay.farmersbayapi.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
