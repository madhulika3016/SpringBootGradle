package com;

import java.util.HashSet;

public class Test4 {
			 public static void main(String[] args) {
		 HashSet set1 = new HashSet();
		 HashSet set2 = new HashSet();
		 set1.add("one");
		 set1.add("two");
		 set1.add("three");
		 set2.add("four");
		 set1.addAll(set2);
		 System.out.println(set1);
		 }
		}


