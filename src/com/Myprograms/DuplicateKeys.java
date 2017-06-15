package com.Myprograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateKeys {

	public static void main(String[] args) {
    
		HashMap h = new HashMap();
		Integer i = new Integer(10);
		Integer i2 = new Integer(10);
		h.put(i, "purnima");
		h.put(i2, "puri");
		System.out.println(h);
		
		for (Object obj : h.entrySet()) {
			   Map.Entry<Integer, String> entry = (Map.Entry) obj;
			   System.out.print("Key: " + entry.getKey());
			   System.out.println(", Value: " + entry.getValue());
			}
}


		
	}


