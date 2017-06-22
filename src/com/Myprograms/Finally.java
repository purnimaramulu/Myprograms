package com.Myprograms;

public class Finally {

	public static void main(String[] args) {
    try{
     int data= 25/0;
     System.out.println(data);
    }
    catch(ArithmeticException ex){
    	System.out.println(ex);
    	
    }
    finally{
    	System.out.println("this is the finally block");
    }
    
	}

}
