package com.bharath.spring.springcore_advanced.injecting_interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("inside OrderDAOImpl.createOrder()");
	}
}
