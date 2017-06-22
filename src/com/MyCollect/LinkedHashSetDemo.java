package com.MyCollect;

import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String>  LH = new LinkedHashSet<String>();
		LH.add("three");
		LH.add("one");
		LH.add("two");
	
		LH.add("four");
		
		Iterator itr =LH.iterator();
		while(itr.hasNext()){
			System.out.println("numbers"+itr.next());
		}

		
	    
	}

}
