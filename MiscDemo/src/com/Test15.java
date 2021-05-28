package com;

import java.util.ArrayList;

public class Test15 {
	    public static void main(String argv[]){      
	     ArrayList list = new ArrayList(); 
	      ArrayList list1 = list; 
	      ArrayList list2 = list; 
	      list1.add(0, "Welcome"); 
	      list2.add(1, "Wow");
	      System.out.println(list2);
	    }
	}


