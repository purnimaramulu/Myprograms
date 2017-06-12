package com.Myprograms;

public class SearchString {

	public static void main(String[] args) {
    
		String str = "Hello";
		int index = str.indexOf("e");
		
		if(index ==-1){
			System.out.println("Element not found");
		}
		else{
			System.out.println("Element found :"+index);
		}
		
		
		String str1 = "purnima";
		String reverse =new StringBuffer(str1).reverse().toString();
		System.out.println("this is the string :"+str1);
		System.out.println("this is the reverse string"+reverse);

		
	}

}
