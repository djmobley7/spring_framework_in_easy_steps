package com.bharath.spring.springcore_advanced.standalone_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore_advanced/standalone_list/beans.xml");
		Products products = (Products)context.getBean("products");
		System.out.println(products);
		
		((AbstractApplicationContext)context).close();
	}
}
