package com.Myprograms;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.Iterator;


public class MaptoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, Integer> cl = new HashMap<String, Integer>();
        cl.put("purnima", 1);
        cl.put("priya", 2);
        cl.put("me", 3);
        System.out.println("the collection values are"+cl);
        
        Set<String> keySet = cl.keySet();
        List<String> tl = new ArrayList<String>(keySet);
        
        System.out.println("hashmap to arraylist"+ tl);
       
        
         Collection<Integer> values = cl.values();
         List<Integer>  colection = new ArrayList<Integer>(values);
         
         System.out.println("size of the list is"+colection);

         //to print values from converted list
         
         for(Integer value:colection){
        	 System.out.println(value);
         }
         
         Set<Entry<String, Integer>> set = cl.entrySet();
         List<Entry<String,Integer>> list = new ArrayList<>(set);
         
         
         Iterator<Entry<String, Integer>> it = list.iterator();
         while(it.hasNext()){
        	 Entry<String,Integer> entry = it.next();
        	 System.out.println("converted list is : "+entry);
        	 
        	 
         }
         
         
	}

}
