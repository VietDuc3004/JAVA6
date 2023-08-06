package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

public interface OrderService {

	Order create(JsonNode orderData);

	Object findById(Long id);

	List<Order> findByUsername(String username);

}
