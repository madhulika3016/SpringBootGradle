package com.model;

import org.springframework.beans.factory.annotation.Value;
	import org.springframework.stereotype.Component;
	
	@Component("emp")
	public class Employee123 {
		
		@Value("${eid}")
		private int eid;
		
		@Value("${ename}")
		private String ename;
		
		@Value("${tech}")
		private String tech;
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
		public String getTech() {
			return tech;
		}
		public void setTech(String tech) {
			this.tech = tech;
		}
		@Override
		public String toString() {
			return "Employee123 [eid=" + eid + ", ename=" + ename + ", tech=" + tech + "]";
		}
	}


