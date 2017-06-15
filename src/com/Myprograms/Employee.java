package com.Myprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmployeeDetails{
	int EmployeeNumber;
	String EmployeeName;
	String Address;
	
	public EmployeeDetails(int EmployeeNumber, String EmployeeName, String Address)
	{
		this.EmployeeName = EmployeeName;
		this.EmployeeNumber = EmployeeNumber;
		this.Address = Address;
	}
	public String toString(){
		return this.EmployeeName+""+this.EmployeeNumber+"" +this.Address;
	}
}
class Sortbynumber implements Comparator<EmployeeDetails>{
	public int compare(EmployeeDetails a , EmployeeDetails b){
		return a.EmployeeNumber - b.EmployeeNumber;
		
		
	}
}

class SortbyName implements Comparator<EmployeeDetails>{
	public int compare(EmployeeDetails a, EmployeeDetails b){
		return a.EmployeeName.compareTo(b.EmployeeName);
	}
}

class Employee{
	public static void main(String are[]){
		ArrayList<EmployeeDetails> obj = new ArrayList<EmployeeDetails>();
		obj.add(new EmployeeDetails(111,"purnima", "rjy"));
		obj.add(new EmployeeDetails(123,"puri", "hyd"));
		obj.add(new EmployeeDetails(133,"uma", "delhi"));

		
		System.out.println("\nthis is unsorted");
		for(int i=0; i< obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		
		
		Collections.sort(obj,new Sortbynumber());
		System.out.println("\nthis is sorted");
		for(int i=0; i< obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		
		
		Collections.sort(obj,new SortbyName());
		
		System.out.println("\nthis is sorted name");
		for(int i=0; i< obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		
	}
}






















