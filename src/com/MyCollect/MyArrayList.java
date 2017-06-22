package com.MyCollect;

import java.util.ArrayList;
class Student{
	int studentNumber;
	String studenName;
	int Rollnumber;
	Student(int studentNumber,String studenName,int Rollnumber){
		this.studenName=studenName;
		this.studentNumber=studentNumber;
		this.Rollnumber= Rollnumber;
	}
	
	@Override
	public String toString(){
		return "studentNumber"+studentNumber+"studenName"+studenName+"Rollnumber"+Rollnumber;
	}
}

public class MyArrayList {

	public static void main(String[] args) {
 
    
    Student s1=new Student(101,"purnima",23);  
    Student s2=new Student(102,"sasi",24);  
    Student s3=new Student(103,"ssss",25);  
    Student s4=new Student(104,"ppp",26);  

    
    ArrayList<Student> al = new ArrayList<Student>();
    al.add(s1);
    al.add(s2);
    al.add(s3);
    
    for(Student a:al){
    	System.out.println("values are: "+a);
    }
    ArrayList<Student> al2 = new ArrayList<Student>();
    al2.add(s4);
    al.addAll(al2);
   
    for(Student arr:al2){
    	System.out.println("values are: "+arr);
    }
    al.removeAll(al2);
    System.out.println("size is "+ al2.size());
    
    al.retainAll(al);
    System.out.println("size is "+ al.size());

	}

}
