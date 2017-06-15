package com.Myprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReplace {

	public static void main(String[] args) {
		
		int arr[] = new int[9]; 
		arr[0] =8; arr[1] = 9; arr[2] =3; arr[3] = 5; arr[4] = 7; 	
		
		System.out.println("the lenght of the array is"+ arr.length);
		
	   for(int i=0;i<=4; i++){
		 System.out.println(arr[i]);
		
	    }
	    System.out.println("");
	    System.out.println("after insertion");
	    arr[5] = 10;
	    arr[6] = 11;
	    arr[7] = 12;
	 
	    for(int i=0; i< arr.length; i++){
		 System.out.println(arr[i]);
		
		 
	    }
	    System.out.println("length of the array is"+arr.length);
	 

           for(int i=0; i<arr.length-1;i++){
			
			for(int j=0; j<=arr.length-1;j++){
		
				 int tmp = 0;
		            
				 if (arr[i] > arr[j]) {
		                tmp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = tmp;
		                
		            }
		        }
			
		}
		 for(int c: arr){
			 System.out.println(c);
		 }
		 
	 }
	    
	    

}
