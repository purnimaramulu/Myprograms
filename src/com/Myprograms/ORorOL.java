package com.Myprograms;


 class pen{
	
	private void msg(int a){
		System.out.println("private super");
	
	}
	

}
class cap extends pen{
	public void  msg(){
		System.out.println("private child");
	}
}





public class ORorOL {

	public static void main(String[] args) {
		cap obj =  new cap();
		obj.msg();
		
		
	
	}

}
