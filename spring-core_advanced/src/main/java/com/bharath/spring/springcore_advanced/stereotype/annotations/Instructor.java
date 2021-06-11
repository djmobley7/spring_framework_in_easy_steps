package com.bharath.spring.springcore_advanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 1. Specify @Component by itself to use the default name which is "instructor" in
// this case, or specify another name by supplying a value e.g. "teacher"
// 2. Specify the Scope (optional) using the @Scope annotation
@Component("teacher")
@Scope("prototype")
public class Instructor {
	// Provide primitive values using the @Value annotation
	// You can also use Spring Expression Language (SpEL) to supply values, invoke
	// static methods etc...
	// @Value("110") // value
	// @Value("#{66+44}") // simple expression
	// @Value("#{T(java.lang.Math).abs(-110)}") // static method
	// @Value("#{new Integer(110)}") // new Integer object
	@Value("#{T(java.lang.Integer).MIN_VALUE}") // static value
	private int id;

	// @Value("Mr. Mobley")
	@Value("#{new String('Mr. Mobley').toUpperCase()}") // new String object (and call method on it) - use single quotes
														// with SpEL
	private String name;

	// inject collection types using SpEL (and list defined in
	// beans.xml)
	@Value("#{courses}")
	private List<String> courses;

	//@Value("#{1+1!=2}")
	@Value("#{1+1!=2?false:true}")
	private boolean Active;

	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", courses=" + courses + ", Active=" + Active + ", profile="
				+ profile + "]";
	}

}
