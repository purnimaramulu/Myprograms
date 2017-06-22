package com.Myprograms;

import java.io.IOException;

public class ThrowsandThow {
    void m() throws IOException{
    	throw new IOException("some error");
    	
    }
    void n() throws IOException{
    	m();
    }
    void p() {
    	try{
    		n();
    	}catch(Exception e){System.out.println("caught exception");}
    }
	public static void main(String[] args) {
		
		ThrowsandThow  obj = new ThrowsandThow();
		obj.p();
		System.out.println("this will work");
	}

}
