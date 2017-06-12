package com.Myprograms;

import java.util.ArrayList;
import java.util.List;

public class ArraySubList {

	public static void main(String[] args) {
    ArrayList<Integer> all = new ArrayList<Integer>();
    
    all.add(1);
    all.add(2);
    all.add(3);
    all.add(4);
    all.add(5);
    all.add(6);


    
    System.out.println("Original List is"+all);
    
    ArrayList<Integer> all3 = new ArrayList<Integer>(all.subList(1, 4));
    System.out.println("sublist of the arrayList"+all3);

    List<Integer> list = all.subList(1, 4);
    System.out.println("sublist in list"+list);
	}

}
