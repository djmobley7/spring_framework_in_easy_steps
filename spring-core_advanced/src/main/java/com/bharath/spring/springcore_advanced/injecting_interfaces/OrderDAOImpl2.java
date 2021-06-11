package com.bharath.spring.springcore_advanced.injecting_interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("inside OrderDAOImpl2.createOrder()");
	}

}
