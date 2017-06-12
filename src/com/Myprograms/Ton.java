package com.Myprograms;

public class Ton {
    private static Ton my;
    
    
    static{
    	my = new Ton();
    }
    private Ton(){
        
    }
    public static Ton getInstance(){
        return my;
    }
     
    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Ton ms = getInstance();
    ms.testMe();


	}

}
