package com.Myprograms;

import java.util.Scanner;

public class Stringlength {

	public static void main(String[] args) {
    String str = new String("I am going to work on string");
    
   
   System.out.println("the length of the string is"+ str.trim());
   System.out.println("the length of the string is"+ str.length());
  
   
   System.out.println("\nspliting words 1 way");
   for(String s: str.split("\\s",0)){
	   System.out.println(s);
   }
    System.out.println("\n spliting words 2 way");
    for(String s: str.split("\\s",1)){
 	   System.out.println(s);
    }
   
    System.out.println("\nspliting words 3 way");
    for(String s: str.split("\\s",3)){
 	   System.out.println(s);
    } 
    
    
	}
}