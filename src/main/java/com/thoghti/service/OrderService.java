package com.thoghti.service;

import java.util.List;

import com.thoghti.repository.entity.OrderEntity;

public interface OrderService {
	
	public List<OrderEntity> insertOrders(List<OrderEntity> orders);
	public OrderEntity getOrder(Integer orderId);
	public List<OrderEntity> getOrders();
	

}
