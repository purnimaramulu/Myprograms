package com.Myprograms;


abstract class table{
	abstract void msg();
	
	
	final void msg1(){
		System.out.println("this is the table");
	}
}

class b extends table{
	void msg(){
		System.out.println("mine name is");
	}
}


public class Abstract {

	public static void main(String[] args) {
    b obj = new b();
    obj.msg();
    obj.msg1();
	}

}
