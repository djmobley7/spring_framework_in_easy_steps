package com.bharath.spring.springcore.dependency_check;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/dependency_check/beans.xml");

		Prescription prescription = (Prescription) ctx.getBean("prescription");
		
		System.out.println(prescription);
	}
}
