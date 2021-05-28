package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		 int time = Integer.parseInt("4");
		  Queue<Integer> queue = new LinkedList<>();
		  for (int i = time; i > 0; i--)
		   queue.offer(new Integer(i));
		  while (!queue.isEmpty()) {
		   System.out.print(queue.poll());
		  }
		  
		  List<Object> list = new ArrayList<>();
		    list.add(123);
		    list.add("John");
		    list.add(1,1.22f);
		    list.add(123);
		    list.remove(0);
		    System.out.println(list);
		    
		    Stack<Integer> stack = new Stack<>();
		    stack.push(new Integer(3));
		    stack.push(new Integer(2));
		    stack.pop();
		    stack.push(new Integer(5));
		    System.out.println(stack);

	}

}
