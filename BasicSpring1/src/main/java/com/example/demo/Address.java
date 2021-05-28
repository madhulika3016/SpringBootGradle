package com.example.demo;

import org.springframework.stereotype.Component;

//@Component
public class Address {
	
	String city="Mumbai";

	public String getCity() {
		return city;
	}

	/*
	 * public void setCity(String city) { this.city = city; }
	 */

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	

}
