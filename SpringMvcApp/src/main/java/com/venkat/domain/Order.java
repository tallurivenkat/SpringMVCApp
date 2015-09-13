package com.venkat.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@javax.persistence.Entity
@Table(name="OrderData")
public class Order {
	
	@Id
	@GeneratedValue
	private int orderId;
	@Column
	@NotNull
	@Size(min=2,max=20)
	private String title;
	@Column
	@DecimalMin(value="2.0")
	@DecimalMax(value="100.0")
	private double price;

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", title=" + title + ", price="
				+ price + "]";
	}
	
	
	
}
