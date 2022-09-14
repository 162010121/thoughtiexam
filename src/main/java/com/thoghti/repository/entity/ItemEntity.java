package com.thoghti.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Item")
@Data
public class ItemEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer itemId;
	private String itemName;
	private double itemUnitPrice;
	private int itemQuantity;
	@ManyToOne
	@JoinColumn(name = "orderId")
	private OrderEntity order;

}
