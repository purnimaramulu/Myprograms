package com.Myprograms;

public class DefaultSingleton {

	private static DefaultSingleton instance = null;
	private DefaultSingleton(){
		
	}
	public static DefaultSingleton getInstance(){
		if(instance == null){
			instance = new DefaultSingleton();
		}
		return instance;
	}
	
	
	
	public static void main(String[] args) {
        
	}

}
