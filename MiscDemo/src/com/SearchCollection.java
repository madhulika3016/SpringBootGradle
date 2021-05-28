package com;

	import java.util.List;
	import java.util.ArrayList;
	import java.util.Collections;

	public class SearchCollection {
	   public static void main(String[] args) {
	      List<String> techs = new ArrayList<String>();
	      techs.add("java");
	      techs.add("flex");
	      techs.add("flash");
	      Collections.sort(techs);
	      System.out.print(Collections.binarySearch(techs, "flex") + "   ");
	      System.out.print(Collections.binarySearch(techs, "flash"));
	   }
	}

