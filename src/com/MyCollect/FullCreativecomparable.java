package com.MyCollect;
import java.util.*;



class Developer implements Comparable<Developer>{
    String DevName;
	double Sal;
	int DevID;
	
	public Developer(String DevName,double Sal,int DevID){
		this.DevName = DevName;
		this.Sal = Sal;
		this.DevID = DevID;
		
	}
	
	public int compareTo(Developer b){
		if(Sal> b.Sal)
			return 1;
		else if(Sal< b.Sal)
			return -1;
		else
			return 0;
		
	}
	
	@Override
	public String toString(){
		return DevID+" "+DevName+" "+Sal;
	}
}

public class FullCreativecomparable {

	public static void main(String[] args) {
     
		TreeSet<Developer> trr = new TreeSet<Developer>();
		
		Developer dev = new Developer("sasi",15000,12345);
		Developer dev2 = new Developer("purnima",16000,12350);
		Developer dev3 = new Developer("priya",17000,12360);
		
		trr.add(dev);
		trr.add(dev2);
		trr.add(dev3);
		
		
		for(Developer dr: trr ){
			System.out.println("values are :"+dr);
	
			
		}
		
		System.out.println("value of the sasi is"+dev);
	}

}
