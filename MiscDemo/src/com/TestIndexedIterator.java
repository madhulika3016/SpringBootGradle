package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class TestIndexedIterator {
		   public static void main(String args[]) {
		    List<String> myList = new ArrayList<String>();
		   myList.add("Windows");
		    myList.add("Linux");
		   myList.add("Mac OS");
		   int index=0;
		   /*for (Iterator<String> myListiterator = myList.iterator(); myListiterator.hasNext();) {
		     System.out.println(myList.get(index++));*/
		     
		     int array[] = new int [5];
		        for (int i = 5; i > 0; i--)
		            array[5 - i] = i;
		        Arrays.sort(array);
		        System.out.print(Arrays.binarySearch(array, 4));
		        
		        List list = new ArrayList();
		        list.add("1");
		        list.add("2");
		        list.add(1, "3");
		        list.remove(2);
		        List linkedlist = new LinkedList(list);
		        list.addAll(linkedlist);
		        linkedlist = list.subList(0,3);
		        linkedlist.clear();
		        System.out.println(list);
		        
		        Set<Integer> set = new HashSet<Integer>();
		        Integer i1 = 45;
		        Integer i2 = 46;
		         set.add(i1);
		         set.add(i1);
		        set.add(i2); System.out.print(set.size() + " ");
		         set.remove(i1); System.out.print(set.size() + " ");
		        i2 = 47;
		        set.remove(i2); System.out.print(set.size() + " ");
		        
		        ArrayList<Integer> list1 = new ArrayList<>(1);
		        list1.add(1001);
		        list1.add(1002);
		        //System.out.println(list1.get(list1.size()));
		        
		        //List<Object> list11 = new ArrayList<String>();/*error at line 3*/
		        //list11.add("test");/*error at line 4*/
		       // list11.add(new Integer(1));/*error at line 5*/
		       // list11.add(new Double(1.23223));/*error at line 6*/
		       // list11.add(12.3f);/*error at line 7*/
		        
		        HashMap<String,Integer> map = new HashMap();
		        map.put("A", 1);
		        map.put("B", 2);
		        map.put("C", 3);
		        System.out.println(map);
		        
		        List<Object> list3 = new ArrayList<Object>();
		        list3.add("HI");
		        list3 = Collections.emptyList();
		        System.out.println(list3.size());
		        
		        Vector obj = new Vector(4,2);
		        obj.addElement(new Integer(3));
		        obj.addElement(new Integer(2));
		        obj.addElement(new Integer(5));
		        obj.removeAll(obj);
		        System.out.println(obj.isEmpty());
		        
		        ArrayList<String> strings = new ArrayList<String>();
		        strings.add("aAaA");
		        strings.add("AaA");
		        strings.add("aAa");
		        strings.add("AAaa");
		        Collections.sort(strings);
		        for (String s : strings) { System.out.print(s + " "); }
		  }
		 }
		


