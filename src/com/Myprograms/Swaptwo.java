package com.Myprograms;

public class Swaptwo {

	public static void main(String[] args) {
     int x= 1;
     int y = 2;
     System.out.println("X is "+x);
     System.out.println("Y is "+y);
     x = x+y;
     y= x-y;
     x= x-y;
     System.out.println("after swap"+x);
     System.out.println("after swap"+y);

     

	}

}
