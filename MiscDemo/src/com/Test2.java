package com;

import java.util.HashSet;

public class Test2 {
		 public static void main(String[] args) {
		  HashSet<Vehicle> s = new HashSet<>();
		  s.add(new Vehicle());
		  s.add(new Vehicle());
		  for (Vehicle v : s) {
		   System.out.println(v);
		  }
		 }
		}

		class Vehicle {
		 int vehicleNo = 123;

		 Vehicle() {
		  vehicleNo = 456;
		 }

		 @Override
		 public String toString() {
		  return "Vehicle No " + vehicleNo;
		 }
		}



