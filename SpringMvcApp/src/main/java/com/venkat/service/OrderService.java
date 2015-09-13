/**
 * 
 */
package com.venkat.service;

import java.util.List;

import com.venkat.domain.Order;

/**
 * @author talluri
 *
 */
public interface OrderService {
	
	public void persist(Order order);
	
	public List<Order> getAll();
	

}
