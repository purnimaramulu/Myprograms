package com.MyCollect;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
    HashSet<String>  HH = new HashSet<String>();
    
    
    HH.add("integers");
    HH.add("chars");
    HH.add("bytes");
    HH.add("integers");
    HH.add("chars");
    Iterator it = HH.iterator();
    while(it.hasNext())
    {
    	System.out.println("set values :"+it.next());
    	System.out.println("set values :"+HH.toString());

    }
	}

}
