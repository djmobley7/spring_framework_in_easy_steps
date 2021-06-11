package com.bharath.spring.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bharath/spring/springcore/ref/beans.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println(student);
	}
}
