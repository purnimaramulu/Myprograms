package com.Myprograms;

public class Thorw {
	static void validate(int a){
		
		if(a<18){
			throw new ArithmeticException("not valid");
		}
		else{
			System.out.println("this is the else blcok");
		}
	};
	
	public static void main(String[] args) {
		validate(15);
    
	}

}
