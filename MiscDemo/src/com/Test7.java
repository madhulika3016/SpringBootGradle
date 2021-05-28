package com;

import java.util.HashSet;

class Vehicle1{
		 int vehicleNo = 123;
		 Vehicle1(){
		  vehicleNo = 456;
		 }
		 @Override
		 public String toString() {
		  return "Vehicle No "+vehicleNo;
		 }
		}
		class Test7{
		 public static void main(String[] args) {
		  HashSet<Vehicle> s = new HashSet<>();
		  s.add(new Vehicle());
		  s.add(new Vehicle());
		  for(Vehicle v : s){
		   System.out.println(v);
		  }
		 }

}
