/**
 * 
 */
package com.venkat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkat.dao.BaseDao;
import com.venkat.domain.Order;

/**
 * @author talluri
 *
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	BaseDao dao;
	@Override
	public void persist(Order order) {
		dao.persist(order);
		
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll(Order.class);
	}

}
