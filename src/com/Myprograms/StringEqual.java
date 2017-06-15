package com.Myprograms;

public class StringEqual {

	public static void main(String[] args) {
      String s1 = "purnima";
      String s2 = "purnima";
      String s3 = new String("purnima");
      String s4 = "suri";
      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
      System.out.println(s1.equals(s4));

      String s5 = "PURNIMA";
      
      String s6 = "purnima";
      System.out.println(s5.equals(s6));
      System.out.println(s5.equalsIgnoreCase(s6));

     System.out.println(s1==s2);
     System.out.println(s1==s3);
     
     System.out.println(s1.compareTo(s2));

      

      
	}

}
