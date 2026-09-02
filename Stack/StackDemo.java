package com.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
                
    	Stack <Integer> s= new Stack<Integer>();
    	s.push(10);
    	//s.push("krt");
    	//s.push('c');
    	//s.push(10.5);
    	s.push(null);
    	
    	
    	System.out.println("Before Stack Operation");
         
    	Student std = new Student();
    	//s.push(std);
    	System.out.println(s);
    	s.pop();
    	s.pop();
    	s.pop();
    	System.out.println("After 3 POP Operation");
    	System.out.println(s);
    	System.out.println(s.peek());
    	System.out.println(s.empty());
    	System.out.println(s.size());
    }
}
