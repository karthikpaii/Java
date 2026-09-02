package com.exp;

public class ExceptionDemo {
    public static void main(String[] args) {
    	try{
    		int a=100/0;
    	}
    	
    	catch (ArithmeticException e){
    		System.out.println("Arithmetic Exception");
    	}
    	
    	catch (RuntimeException e){
    		System.out.println("Runtime Exception");
    	}
    	
    	
    	catch (Exception e){
    		System.out.println("Exception");
    	}
       
       
    }
    
}
