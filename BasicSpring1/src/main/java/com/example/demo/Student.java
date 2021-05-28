package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	int sid=101;
	String sname="Madhulika";
	
	/*
	 * @Autowired Address address;
	 */
	
	/*
	 * public Address getAddress() { return address; } public void
	 * setAddress(Address address) { this.address = address; }
	 */
	

	/*
	 * public Student(int sid, String sname, Address address, Laptop laptop) {
	 * super(); this.sid = sid; this.sname = sname; this.address = address;
	 * this.laptop = laptop; }
	 */

	//@Autowired
	Laptop laptop;
	
	public Laptop getLaptop() 
	{ 
		return laptop; 
	}
	public void setLaptop(Laptop laptop) 
	{ 
		this.laptop = laptop; 
		}
	 
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void show()
	{
		System.out.println(toString());
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname +  " laptop=" + laptop + "]";
	}
	
	
}
