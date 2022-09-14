package com.thoghti.repository.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "Order_tl")
@Data
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	private Date orderDate;
	private String orderStatus;
	@OneToMany(targetEntity = ItemEntity.class)
	private List<ItemEntity> items;
	

}
