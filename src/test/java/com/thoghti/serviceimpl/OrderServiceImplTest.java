package com.thoghti.serviceimpl;


import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.thoghti.repository.OrderEntityRepository;
import com.thoghti.repository.entity.OrderEntity;
import com.thoghti.service.impl.OrderServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
public class OrderServiceImplTest {
	
	@InjectMocks
	private OrderServiceImpl service;
	@Mock
	private OrderEntityRepository repository;
	
	@Test
	 public void testInsertOrder()throws Exception
	{
		OrderEntity entity1=new OrderEntity();
		OrderEntity entity2=new OrderEntity();
		List<OrderEntity> orders=new ArrayList<>();
		orders.add(entity1);
		orders.add(entity2);
		when(repository.saveAll(Mockito.any())).thenReturn(orders);
		List<OrderEntity> orders2 =service.insertOrders(orders);
		assertNotNull(orders2);
		
		
		
	}
	@Test
	public void testGetOrder() throws Exception
	{
		OrderEntity orderEntity=Mockito.mock(OrderEntity.class);
		when(repository.findById(Mockito.anyInt())).thenReturn(Optional.of(orderEntity));
		OrderEntity entity=service.getOrder(123);
		assertNotNull(entity);
		
		
		
	}
	@Test
	public void testGetOrders()
	{
		
		List<OrderEntity> orders=new ArrayList<>();
		when(repository.save(Mockito.any())).thenReturn(orders);
		List<OrderEntity> orders2=service.getOrders();
		assertNotNull(orders2);
		
	}

}

