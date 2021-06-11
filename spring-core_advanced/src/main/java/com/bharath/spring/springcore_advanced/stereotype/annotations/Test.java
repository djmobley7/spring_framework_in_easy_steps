package com.bharath.spring.springcore_advanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore_advanced/stereotype/annotations/beans.xml");
		//Instructor instructor = (Instructor)context.getBean("instructor");
		Instructor instructor = (Instructor)context.getBean("teacher");
		System.out.println(instructor);
		//System.out.println(instructor.hashCode());
		
		Instructor instructor2 = (Instructor)context.getBean("teacher");
		System.out.println(instructor2);
		//System.out.println(instructor2.hashCode());
	}
}
