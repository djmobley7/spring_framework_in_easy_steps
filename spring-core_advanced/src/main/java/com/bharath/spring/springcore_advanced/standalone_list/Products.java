package com.bharath.spring.springcore_advanced.standalone_list;

import java.util.List;

public class Products {
	private List<String> names;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Products [names=" + names + "]";
	}
}
