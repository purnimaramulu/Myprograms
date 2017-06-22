package com.Myprograms;

public class Factrecursion {
	
	
	
		static int m1=0;
		static int m2=1;
		static int m3=0;
		static void febonacci(int count){
			
			if(count>0){
				m3= m1+m2;
				m1=m2;
				m2=m3;
				System.out.println(""+m3);
				febonacci(count-1);
			}
			
		}
	
	
	

	public static void main(String[] args) {
    int count=15;
    System.out.println(m1+""+m2);
    febonacci(count-2);

	}

}
