package com.bharath.spring.springcore.life_cycle.xml_config;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setId()");
		this.id = id;
	}
	
	public void hi() {
		System.out.println("Hi");
	}
	
	public void bye() {
		System.out.println("Bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	
}
