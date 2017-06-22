package com.Myprograms;
public class RecursionExample {

	static int count=0;
	
	static void p(){
		count++;
		
		if(count<=5){
			System.out.println("hey"+count);
			p();
		}
	}
	static int factorial(int n){
		if(n==1){
			return 1;
		}
		else {
			return(n*factorial(n-1));
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
	p();
    System.out.println("factorial is :"+factorial(10));
	}
	

}
