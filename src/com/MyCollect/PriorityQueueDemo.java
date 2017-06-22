package com.MyCollect;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
    PriorityQueue<String> queue = new PriorityQueue<String>();
    queue.add("one");
    queue.add("two");
    queue.add("three");
    queue.add("four");
    

    
   
    for(String ss:queue){
    	System.out.println(ss);
    }
    System.out.println("head:"+queue.element());  
    System.out.println("one:"+queue.peek());  

    queue.remove();
    queue.poll();
    System.out.println("after removing two elements:");  
   Iterator<String> ir = queue.iterator();
   while(ir.hasNext()){
	   System.out.println("elements are"+ir.next());
   }
    
	}

}
