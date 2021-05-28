package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class WrappedString {
	private String s;
	public WrappedString(String s) 
	{ 
		this.s = s; 
	}
	public static void main(String[] args) {
	HashSet hs = new HashSet();
	 WrappedString ws1 = new WrappedString("aardvark");
	 WrappedString ws2 = new WrappedString("aardvark");
 String s1 = new String("aardvark");
	 String s2 = new String("aardvark");
	 hs.add(ws1); hs.add(ws2); hs.add(s1); hs.add(s2);
	 System.out.println(hs.size()); 
	 Map<String,String> Books = new HashMap<String, String>();
	    Books.put("Java", "James Gosling");
	    Books.put("C", "Dennis Ritchie");
	    Books.put("C++", "Stratestroupe");
	    Books.put("Java", "Booch");

	    // for(Entry<String, String> entry:Books){
	      //System.out.println(entry.getKey() + " - " + entry.getValue());
	    // }
	
	} }
	


