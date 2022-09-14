package com.thoghti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thoghti.repository.entity.OrderEntity;
import com.thoghti.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	@PostMapping("/order/create")
	public ResponseEntity<List<OrderEntity>> inserOrder(@RequestBody List<OrderEntity> orders)
	{
		return new ResponseEntity<List<OrderEntity>>(orderService.insertOrders(orders),HttpStatus.OK);
	}
	
	@GetMapping("/order/{order_id}")
	public ResponseEntity<OrderEntity> getOrder(@PathVariable("order_id") Integer order_id)
	{
		return new ResponseEntity<OrderEntity>(orderService.getOrder(order_id),HttpStatus.OK);
	}
	@GetMapping("/orders")
	public ResponseEntity<List<OrderEntity>> getOrders()
	{
		return new ResponseEntity<List<OrderEntity>>(orderService.getOrders(),HttpStatus.OK);
	}
	

}
