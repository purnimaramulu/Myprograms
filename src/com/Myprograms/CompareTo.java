package com.Myprograms;

public class CompareTo {

	public static void main(String[] args) {
     String str = "Purnima";
     String str2 = "Purnima";
     String str3 = "book";
     System.out.println(str.compareTo(str2));
     System.out.println(str.compareTo(str3));
     System.out.println(str3.compareTo(str));

     String obj = "purnima"+ "book";
     System.out.println(obj);
     String obj2 = str.concat(str3);
     System.out.println(obj2);
     
     StringBuffer sb=new StringBuffer("Hello ");  
     
     sb.append("this string am adding");
     System.out.println(sb);
     sb.insert(1, "hey i am inserting value here");
     System.out.println(sb);
     sb.replace(1,3, "java");
     System.out.println(sb);
     sb.delete(1, 6);
     System.out.println(sb);
     sb.reverse();
     System.out.println(sb);
     sb.capacity();
     sb.append("purnima");
     System.out.println(sb);
   sb.ensureCapacity(70);
   System.out.println(sb);

	}

}
