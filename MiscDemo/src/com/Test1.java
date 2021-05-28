package com;

import java.util.TreeSet;

public class Test1 {
	public static void main(String argv[]) throws InterruptedException {

		  TreeSet<Object> myMap = new TreeSet<>();
		        String s1 = new String("test");
		        String s2 = new String("test");
		        Sample s3 = new Sample("test");
		        Sample s4 = new Sample("test");
    myMap.add(s1);
    myMap.add(s2);
    myMap.add(s3);
    myMap.add(s4);
   
    System.out.println(myMap);
}
}

class Sample{
private String str;

Sample(String str ){
    this.str = str;
}
}


