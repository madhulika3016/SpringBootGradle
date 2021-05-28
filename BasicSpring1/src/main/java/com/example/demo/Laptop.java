package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	int lid=111;
	String Company="lenovo";
	
	/*
	 * public int getLid() { return lid; } public void setLid(int lid) { this.lid =
	 * lid; } public String getCompany() { return Company; } public void
	 * setCompany(String company) { Company = company; }
	 */
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", Company=" + Company + "]";
	}
	
}
