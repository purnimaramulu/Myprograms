package com.Myprograms;

public class Recursion {

	
	 
	int sum=0;
	
	public int getnumsum(int number){
		if(number==0){
			return sum;
		}
		else{
			sum += (number%10);
			getnumsum(number/10);
		}
		return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		Recursion obj = new Recursion();
		
		System.out.println("number is :"+obj.getnumsum(123));
	}

}
