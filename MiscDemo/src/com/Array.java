package com;

	import java.util.*;
	public class Array{
	public static void main(String args[])
	{
	  int array[]=new int[5];
	  for(int i=5;i>0;i--)
	    array[5-i]=i;
	  Arrays.fill(array,1,3,7);
	   for(int i=0;i<5;i++)
	      System.out.print(array[i]);
	  }
	 }  
	 


