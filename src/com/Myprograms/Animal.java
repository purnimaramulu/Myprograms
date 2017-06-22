package com.Myprograms;

class Operation{
	int data = 50;
	
	
	
	void change(int data){
		this.data = data;
		
	}
}





public class Animal {

	public static void main(String[] args) {
		Operation obj = new Operation();
		System.out.println("before change : "+obj.data);
		obj.change(500);
		System.out.println("after change : "+obj.data);

	}

}
