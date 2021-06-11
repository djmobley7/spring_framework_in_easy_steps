package com.bharath.spring.springcore.life_cycle.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/life_cycle/annotations/beans.xml");
		
		// need to call registerShutdownHook on the application context in order for destory methods to be called
		ctx.registerShutdownHook();
		
		Patient patient = (Patient)ctx.getBean("patient");
		System.out.println(patient);
	}
}
