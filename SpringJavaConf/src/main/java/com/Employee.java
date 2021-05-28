package com;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int eid;
	private String ename;
	
	public Employee() {
		super();
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	public void show()
	{
		setEid(102);
		setEname("Tushar");
		System.out.println(toString());
		
	}
}
