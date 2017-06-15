package com.Myprograms;

import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int l,b,perimeter, Area;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		l= sc.nextInt();
		System.out.println("enter breadth");
		b= sc.nextInt();
		perimeter = 2*(l+b);
		System.out.println("the perimeter of the lenght is"+perimeter);
		
		Area = l*b;
		System.out.println("the are is"+Area);

	}

}
