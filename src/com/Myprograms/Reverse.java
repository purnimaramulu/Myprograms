package com.Myprograms;

public class Reverse {
	
	public int reverse(int Number){
		 int revernum=0;
		while(Number !=0){
			revernum = (revernum*10)+(Number%10);
			Number = Number/10;
		}
		return revernum;
	}
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse nr = new Reverse();
	        System.out.println("Result: "+nr.reverse(2133));

	}

}
