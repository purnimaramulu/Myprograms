package com.MyCollect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapnonGeneric {

	public static void main(String[] args) {
    Map map = new HashMap();
    map.put(1,"purnima");  
    map.put(5,"ma");  
    map.put(2,"mama");  
    map.put(6,"surya");  
    
    Set set = map.entrySet();
    
    Iterator ir = set.iterator();
      while(ir.hasNext()){
    	  Map.Entry  entry =(Map.Entry)ir.next();
    	  
    	  System.out.println(entry.getValue()+""+entry.getKey());
      }
      
     Map<Integer,String> map2 = new HashMap<Integer,String>();
     
     map2.put(12, "bench");
     map2.put(13, "chair");
     map2.put(15, "bottle");
     
     for(Map.Entry hh:map2.entrySet()){
    	 
    	 System.out.println(hh.getValue()+""+hh.getKey());
    	 
     }
     

     
     
      
      
      
	}

}
