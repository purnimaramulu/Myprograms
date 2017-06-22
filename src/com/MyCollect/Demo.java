package com.MyCollect;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		  List ts1 = new ArrayList();
		  ts1.add(new MyFactor ("Tom",100,15000, 0));
	        ts1.add(new MyFactor ("puri",200,413342, 0));
	        ts1.add(new MyFactor ("ppp",300,13412342, 0));
	        ts1.add(new MyFactor ("phone",400,12434, 0));
		Collections.sort(ts1);
		
		Iterator itr = ts1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

