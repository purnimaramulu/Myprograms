package com.Myprograms;
class vehicle{
		
		String color;
		int number;
		int weight;
		
		public void carmethod(){
			System.out.println("I am running"+ color);
			System.out.println("I am running"+ number);
			System.out.println("I am running"+ weight);


		}
		
	}

class Car extends vehicle{
		
		int ccnumber;
		int zipcode;
		public void carmethod(){
		System.out.println("my color i s"+ color);
		System.out.println("my number is "+ number);
		System.out.println("my weight is"+ weight);
		System.out.println("my ca rcc number is"+ ccnumber);
		System.out.println("my zipcode"+ zipcode);


		}

}
		
	
	

public class Inheritance {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		
		Car b1 = new Car();
		b1.color = "blue";
		b1.number= 20;
		b1.weight= 20;
		b1.ccnumber= 20;
		b1.zipcode= 20;
       b1.carmethod();

		
		
		
		
		
		
	}

}
