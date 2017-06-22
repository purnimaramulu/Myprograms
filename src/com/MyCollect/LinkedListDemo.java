package com.MyCollect;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		  LinkedList<String> Lk=new LinkedList<String>();  
		  Lk.add("purnima");
		  Lk.add("Adapt");
		  Lk.add("FULL");
		

     Iterator itr = Lk.iterator();
     
     while(itr.hasNext()){
    	 System.out.println("values are :"+itr.next());
     }
	}

}
