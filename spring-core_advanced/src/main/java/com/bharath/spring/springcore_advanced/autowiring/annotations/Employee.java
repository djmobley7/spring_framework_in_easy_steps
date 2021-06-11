package com.bharath.spring.springcore_advanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private Address address; // note: can also you on the field level, and you no longer need a setter...
	
//	public Employee(Address address) {
//		this.address = address;
//	}

	public Address getAddress() {
		return address;
	}

	// If there are multiple matching beans you can use Qualifier annotation specifying the name
	
	@Autowired(required=false)
	@Qualifier("address2") 
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
