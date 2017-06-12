package com.Myprograms;

public class Encapsulation {

	   public int ssn;
	   public String empName;
	   public int empAge;

	    //Getter and Setter methods
	    public int getEmpSSN(){
	        return ssn;
	    }

	    public String getEmpName(){
	        return empName;
	    }

	    public int getEmpAge(){
	        return empAge;
	    }

	    public void setEmpAge(int newValue){
	        empAge = newValue;
	    }

	    public void setEmpName(String newValue){
	        empName = newValue;
	    }

	    public void setEmpSSN(int newValue){
	        ssn = newValue;
	    }
	
	    public static class EncapsTest{
	    public static void main(String args[]){
	    	Encapsulation obj = new Encapsulation();
	         obj.setEmpName("Mario");
	         obj.setEmpAge(32);
	         obj.setEmpSSN(112233);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee SSN: " + obj.getEmpSSN());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	    } 
	
	    }}
	
	
	
	
	
	
	
	
	

		
		
		
		
		
		
	


