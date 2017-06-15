package com.Myprograms;

import java.util.Scanner;

public class FactByUserValue {

	public static void main(String[] args) {
     int n, mul;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the number ");
     n = sc.nextInt();
   
     FactByUserValue obj = new FactByUserValue();
     mul = obj.fact(n);
     System.out.println("factorial of number"+n+" :"+mul);
     
   
	}
	int fact(int x){
		
		if(x>1){
			
			
			return(x*fact(x-1));
		}
		
		return 1;
	}

}
