package com.Myprograms;

public class ReverseString {
	
		  public static void main(String[] args) {
		    String s="jagan";
		    String rev="";
		    for (int i=s.length()-1;i>=0;i--) {
		      rev=rev+s.charAt(i);
		    }
		     System.out.println("Reverse String is: "+rev);
		  }
		}