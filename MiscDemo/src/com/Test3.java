package com;

import java.util.ArrayList;

public class Test3 {
	    public static void main(String argv[]){
	      
	     ArrayList list = new ArrayList(); 
	     ArrayList listStr = list; 
	     ArrayList listBuf = list; 
	     listStr.add(0, "Hello"); 
	     String buff = (String) listBuf.get(0);
	       System.out.println(buff.toString());
	    }

	}


