package com.Myprograms;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
    int i, sum = 0,n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number to get the square of it");
    n = sc.nextInt();
    
    for(i=1;i<=n;i++){
    	
    	sum = sum + i * i;
    }
    System.out.println("the square root of "+sum);
    
	}

}
