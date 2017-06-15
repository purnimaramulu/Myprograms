package com.Myprograms;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveVowel {

	public static void main(String[] args) {
      String a, b;
	   
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a string");
      a = sc.nextLine();
      
      b = a.replaceAll("[aeiouAEIOU]", "");
		System.out.println("vowels are removed :"+b);
		System.out.print(b);
		System.out.println("lenght of the string after removing vowels :"+b.length());
		
		
		String str= "I am going to work on string";
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch: str.toCharArray()){
			if(map.containsKey(ch)){
				int val = map.get(ch);
				map.put(ch, val+1);
			}else{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		
		
		
		
		
	}

}
