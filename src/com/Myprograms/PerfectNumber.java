package com.Myprograms;

public class PerfectNumber {

	public boolean perfect(int number){
		int temp=0;
		for(int i=1; i<number/2; i++){
         if(number%i == 0){
        	 temp +=1;
        	 }
         
         }
        if(temp == number){
        	System.out.println("perfect number");
        	return true;
        }
        
        else{
        	System.out.println("not a perfect number");
        	return false;
        	
        }
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumber obj= new PerfectNumber();
		System.out.println("number is "+obj.perfect(12));
	}

}
