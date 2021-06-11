package com.bharath.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bharath.spring.springjdbc.employee.dao.EmployeeDao;
import com.bharath.spring.springjdbc.employee.dto.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bharath/spring/springjdbc/beans.xml");
		EmployeeDao dao = (EmployeeDao)context.getBean("employeeDao");
		
		Employee employee = new Employee(1, "Dan", "Mobley");
		
		int result = dao.create(employee);
		
		System.out.println("Number of records inserted = " + result);
	}
}
