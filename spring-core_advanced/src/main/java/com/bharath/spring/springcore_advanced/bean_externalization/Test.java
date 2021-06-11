package com.bharath.spring.springcore_advanced.bean_externalization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springcore_advanced/bean_externalization/beans.xml");
		MyDAO dao = (MyDAO)context.getBean("dao");
		System.out.println(dao);
	}
}
