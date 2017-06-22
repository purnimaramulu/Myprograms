package com.Exception;

public class ArrayOutOfBound {

	public static void main(String[] args) {
       try{
		int a[] = {1,2,3,4};

	    System.out.println(a[6]);
       }
       catch(ArrayIndexOutOfBoundsException e){
    	   System.out.println("this exception is cached");
    
    
       }
	}

}
