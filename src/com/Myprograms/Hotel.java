package com.Myprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class HotelDetails{
	int days;
	String name;
	int money;
	int rating;
	

public HotelDetails(int days, int money, int rating,String name)
{
	this.days = days;
	this.money = money;
	this.rating = rating;
	this.name = name;
}

public String toString(){
	return "[days=" + this.days + ", name=" + this.name + ", money=" + this.money + ", rating=" +this.rating  + "]";
}
}
class Sortbyrating implements Comparator<HotelDetails>{
	public int compare(HotelDetails a , HotelDetails b){
		return a.rating - b.rating;
		
		
	}
}
class Sortbyamount implements Comparator<HotelDetails>{
	public int compare(HotelDetails a, HotelDetails b){
		return a.money - b.money;
	}
}
class Sortname implements Comparator<HotelDetails>{
	public int compare(HotelDetails a, HotelDetails b){
		return a.name.compareTo(b.name);
	}
}


public class Hotel {

	public static void main(String[] args) {
		
		
		
		
    List<HotelDetails> object = new  ArrayList<HotelDetails>();
    object.add(new HotelDetails(1,200, 5, "park"));
    object.add(new HotelDetails(2,100, 3, "Hyaat"));
    object.add(new HotelDetails(3,50, 2, "Raddisson"));
    object.add(new HotelDetails(4,150, 5, "RainTree"));
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give your prefered days");
    int n = sc.nextInt();
    System.out.println("the element is "+object.contains(n));
    
//
//	System.out.println("\nthis is unsorted");
//	for(int i=0; i< object.size();i++)
//	{
//		System.out.println(object.get(i));
//	}
//	
//	
//	Collections.sort(object , new Sortbyrating());
//    
//	
//	System.out.println("\n after sorting rating");
//	for(int i=0; i< object.size();i++)
//	{
//		System.out.println(object.get(i));
//	}
//	
//	Collections.sort(object , new Sortbyamount());
//	
//	
//	System.out.println("\n sorted amount");
//	for(int i=0; i< object.size();i++)
//	{
//		System.out.println(object.get(i));
//	}
//
//	Collections.sort(object , new Sortname());
//	System.out.println("\n sorted name");
//	for(int i=0; i< object.size();i++)
//	{
//		System.out.println(object.get(i));
//	}
	
	
	
	
	}

}
