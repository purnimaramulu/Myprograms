package com.Myprograms;

public class MultipleCatchException {

	public static void main(String[] args) {
    try{
    	int a[] = new int[5];
    	a[5] = 30/0;
    }
    catch(ArithmeticException e){System.out.println("taks is running");}
    catch(ArrayIndexOutOfBoundsException e){System.out.println( "Array outof bounds");}
    catch(Exception ex){System.out.println("exception is");}
    
    System.out.println("end of the multiple blocks ");
    
    String s = null;
    System.out.println("the letters are " +s.length());
    
    
    String s1= "abc";
    int i = Integer.parseInt(s1);
	}

}
