package com.venkat.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.venkat.domain.Order;
import com.venkat.service.OrderService;

@Controller
@RequestMapping("/*")
public class CreateOrder {
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value="/addOrder",method=RequestMethod.GET)
	public ModelAndView addOrder(){
		
		return new ModelAndView("addOrder","order",new Order());
	}
	
	@RequestMapping(value="/saveOrder",method=RequestMethod.POST)
	public String saveOrder(@Valid Order order, BindingResult result ,ModelMap map){
		if(result.hasErrors())
		{
			return "addOrder";
		}
		else{
		orderService.persist(order);
		map.put("allOrders",orderService.getAll());
		return "listOrders";
		}
	}
	
	@RequestMapping(value="/abc",method=RequestMethod.GET)
	public ModelAndView xyzOrder(){
		
		Order o1=new Order();
		o1.setTitle("new order");
		
		return new ModelAndView("addOrder","xyz",o1);
	}

}
