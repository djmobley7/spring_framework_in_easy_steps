package com.bharath.spring.springcore.inner_beans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/inner_beans/beans.xml");

		Employee employee = (Employee)ctx.getBean("employee");
		
		System.out.println(employee);
	}
}
