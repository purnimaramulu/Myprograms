package com.Myprograms;

public class Exceptionhandling {

	public static void main(String[] args) {
     try{
    	 int data= 50/0;
    	 
     }
     catch(ArithmeticException e){
    	 System.out.println(e);
    	 
     }
     System.out.println("hey");
	}

}