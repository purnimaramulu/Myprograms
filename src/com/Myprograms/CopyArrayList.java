package com.Myprograms;

import java.util.ArrayList;

public class CopyArrayList {
	
	

	public static void main(String[] args) {


		
		ArrayList<Integer>  al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);

		ArrayList<Integer>  al2 = new ArrayList<Integer>();

		al2.add(4);
		al2.add(5);
		al2.add(6);
		
		ArrayList<Integer>  al3 = new ArrayList<Integer>();

        al3.addAll(al1);
        al3.addAll(al2);
        
        for(Integer temp: al3){
        	System.out.println(temp);
        	
        }

	}

}
