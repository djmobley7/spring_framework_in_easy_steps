package com.bharath.spring.springcore.dependency_check;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
	private int id;
	private String name;
	private List<String> medications;

	public int getId() {
		return id;
	}

	// Used required annotation to make the setId() required
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMedications() {
		return medications;
	}

	public void setMedications(List<String> medications) {
		this.medications = medications;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", name=" + name + ", medications=" + medications + "]";
	}
}
