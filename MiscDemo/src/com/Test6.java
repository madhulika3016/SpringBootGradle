package com;

	import java.util.HashSet;
	class Bean{
	private String str;
	Bean(String str ){
	this.str = str;
	}
	public String getStr() {
	return str;
	}
	public boolean equals(Object o){
	if (!(o instanceof Bean)) {
	return false;
	}
	return ((Bean) o).getStr().equals(str);
	}
	public int hashCode() {
	return 12345;
	}
	public String toString() {
	return str;
	}
	}

	public class Test6 {
	public static void main(String ... sss) {
	HashSet myMap = new HashSet();
	String s1 = new String("tom");
	String s2 = new String("tom");
	Bean s3 = new Bean("jerry");
	Bean s4 = new Bean("jerry");
	myMap.add(s1);
	myMap.add(s2);
	myMap.add(s3);
	myMap.add(s4);
	System.out.println(myMap);
	}
	}


