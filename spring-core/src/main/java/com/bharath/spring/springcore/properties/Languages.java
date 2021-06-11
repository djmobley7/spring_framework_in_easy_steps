package com.bharath.spring.springcore.properties;

import java.util.Properties;

public class Languages {
	protected Properties countryAndLanguages;

	public Properties getCountryAndLanguages() {
		return countryAndLanguages;
	}

	public void setCountryAndLanguages(Properties countryAndLanguages) {
		this.countryAndLanguages = countryAndLanguages;
	}
	
	@Override
	public String toString() {
		return countryAndLanguages.toString();
	}
}
