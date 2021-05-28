package com;

	 import java.util.*;
	  public class Mapit {
	  public static void main(String[] args) {
	 Set<Integer> set = new HashSet<Integer>();
	 Integer i1 = 45;
	  Integer i2 = 46;
	 i2 = 47;
	 set.add(i1);
	 set.add(i1);
	 set.add(i2); System.out.print(set.size() + " ");
	  set.remove(i1); System.out.print(set.size() + " ");
	 set.remove(i2); System.out.print(set.size() + " ");
	 
	 List<String> countrylist = new ArrayList<>();
	   countrylist.add("India");
	   countrylist.add("China");
	   countrylist.add("Japan");
	   countrylist.add("Nepal");
	   countrylist.add(3,"Bhutan");
	   countrylist.remove(2);
	   System.out.println(countrylist);
	   
	   TreeSet<String> ts = new TreeSet<> ();
	     ts.add("Swarna");
	      ts.add("Vinay");
	      ts.add("Yogesh");
	      ts.add("Sunil");
	        System.out.println(ts);
	  }
	  }


