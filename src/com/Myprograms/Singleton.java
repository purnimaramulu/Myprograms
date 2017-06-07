package com.Myprograms;

public class Singleton {

	
	private static Singleton obj = new Singleton();
	
	private Singleton(){
		System.out.println("this method is also work");
	}
	
	
	public static Singleton getInstance(){
		return obj;
	}
	public static void method(){
		System.out.println("this is my method");
	}
	public static void main(String[] args) {
		Singleton obj2 = Singleton.getInstance();
		obj2.method();
		
	
	}

}

	

