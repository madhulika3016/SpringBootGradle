package com;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
		 public static void main(String args[]){
		   List<Integer> elements = new ArrayList<>(); 
		   int [] num = {11,22,33,44,55};
		   for(int i=0; i<num.length; i++) {
		    elements.add(num[i]);       
		   }      
		       System.out.println(elements);
		 }  
		}


