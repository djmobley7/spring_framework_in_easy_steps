package com.bharath.spring.springcore_advanced.injecting_interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderBOImpl implements OrderBO {

	private OrderDAO orderDAO;

	@Override
	public void placeOrder() {
		System.out.println("inside OrderBOImpl.placeOrder()");
		orderDAO.createOrder();
	}

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	@Autowired
	@Qualifier("dao") // specify which implementation of OrderDAO to use to avoid unique bean not found exception
	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

}
