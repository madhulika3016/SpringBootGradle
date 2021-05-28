package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test9 {
		 public static void main(String[] args) {
		  List<String> myList = new ArrayList<>();
		        myList.add("Java");
		        myList.add("C");
		         myList.add("C++");
		        Iterator<String> itr = myList.iterator();
		        while(itr.hasNext()){
		            if("C".equals(itr.next())){
		                itr.remove();
		            }
		        }
		        System.out.println(myList);
		 }
		}


