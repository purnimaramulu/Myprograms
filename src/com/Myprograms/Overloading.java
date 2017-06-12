package com.Myprograms;

class demo{
 public void myspeed(int a){
	
	
	 System.out.println("my curren speed is"+ a );
	 
 }
void myspeedafter(int a , int b){
	
	System.out.println("a is "+a+ "b is"+b+"");
	int result= a*b;
	System.out.println(result);
	
}
 double demo(double a){
	
	System.out.println("a id "+a);
	return a*a;
}

}





public class Overloading {

	public static void main(String[] args) {
		
		demo obj1= new demo();
		obj1.myspeed(10);
		obj1.myspeedafter(12, 4);
		
	}

}
