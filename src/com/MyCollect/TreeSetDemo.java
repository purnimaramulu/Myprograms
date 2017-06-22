package com.MyCollect;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
    TreeSet<String> tt = new TreeSet<String>();
    
    tt.add(null);
    tt.add("sasi");
    tt.add("purnima");
   
    
    
    for(String  alpha : tt){
    	System.out.println(alpha);
    }

    
	}

}
