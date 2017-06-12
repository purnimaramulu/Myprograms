package com.Myprograms;

interface a{
	
	 void msg();
	 int msg1(int a);

}

 class bb implements a{
	 
	public void  msg(){
		System.out.println("this is  class which implements inteface");
		
		
	}
   
	 public int msg1(int a){
		
		 return a+a;
	 }

	
	
}



public class Interface {

	public static void main(String[] args) {
		
	 bb obj = new bb();
	 obj.msg1(12);
	 obj.msg();
	
	}

}
