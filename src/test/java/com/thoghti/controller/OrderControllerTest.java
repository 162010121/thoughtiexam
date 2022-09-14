package com.thoghti.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.thoghti.repository.entity.OrderEntity;
import com.thoghti.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)

public class OrderControllerTest {
	
	@InjectMocks
   private	OrderController controller;

	@Mock
	private OrderService service;
	
	@Test
	public void testRigestor()throws Exception
	{
		
		  OrderEntity entity1=new OrderEntity(); OrderEntity entity2=new OrderEntity();
		  List<OrderEntity> orders=new ArrayList<>(); orders.add(entity1);
		  orders.add(entity2);
		 
		  when(service.insertOrders(Mockito.any())).thenReturn(orders);
		  ResponseEntity<List<OrderEntity>>
		  response=controller.inserOrder(Mockito.any()); assertEquals(HttpStatus.OK,response.getStatusCode());
		  assertNotNull(response);	
		
	}
	@Test
	public void testGetOrder() throws Exception
	{
		OrderEntity entity=mock(OrderEntity.class);
		when(service.getOrder(Mockito.any())).thenReturn(entity);
		ResponseEntity<OrderEntity> responce=controller.getOrder(Mockito.any());
		assertEquals(HttpStatus.OK, responce.getStatusCode());
			
	}
	@Test
	public void testGetOrders()throws Exception
	{
		
		List<OrderEntity> entity=mock(List.class);
		when(service.getOrders()).thenReturn(entity);
		ResponseEntity<List<OrderEntity>> responce=controller.getOrders();
		assertNotNull(responce.getBody());
		
		
		
		
		
		
	}
	
		
		
	}
	

