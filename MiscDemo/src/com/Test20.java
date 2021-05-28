package com;

	class A{
		 void test() throws ClassNotFoundException{
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  System.out.println("Oracle class loaded");
		 }
		}
		class B extends A{
		// @Override
		 //void test() throws Exception {
		 { System.out.println("Call the super class method");
		 }
		}
		public class Test20 {
		 public static void main(String args[]) {
		  B b1= new B();
		  //b1.test();
		 }
		}


