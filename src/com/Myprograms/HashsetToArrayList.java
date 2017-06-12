package com.Myprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashsetToArrayList {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		
		hs.add("purnima");
		hs.add("puri");
		hs.add("ppp");
		
		List<String> ls = new ArrayList<String>(hs);
		System.out.println("elements in the set are:" +hs);

		
	}

}
