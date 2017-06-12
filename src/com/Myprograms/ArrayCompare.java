package com.Myprograms;

import java.util.ArrayList;

public class ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> s = new ArrayList<String>();
    s.add("purnima");
    s.add("purnima1");
    s.add("purnima2");
    s.add("purnima3");
    s.add("purnima4");
    
    System.out.println("Arralist is:" +s);
    
    ArrayList<String> s2 = new ArrayList<String>();
    s2.add("purnima");
    s2.add("purnima1");
    s2.add("purnima2");
    s2.add("purnima3");
    s2.add("purnima4");
   
    
    System.out.println("Arralist is:" +s2);

    ArrayList<String> s3 = new ArrayList<String>();
    
    for (String temp : s2)
        s.add(s2.contains(temp) ? "Yes" : "No");
    System.out.println(s3);
    
    ArrayList<Integer> s4= new ArrayList<Integer>();
    for (String temp2 : s)
         s4.add(s2.contains(temp2) ? 1 : 0);
    System.out.println(s4);

    
    
	}

}
