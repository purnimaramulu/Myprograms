package com.Myprograms;

public class ConstructorOverload {

	int id;
	String name;
	int age;
	int marks;
	
	ConstructorOverload(int i, String n){
		id= i;
		name= n;
		
	}
	ConstructorOverload(int i, String n, int a){
		id= i;
		name= n;
		age = a;
		
	}
	ConstructorOverload(int i, String n, int a,int b){
		id= i;
		name= n;
		age = a;
		marks = b;
		
	}
    void display(){System.out.println(id+" "+name+" "+age+""+marks);}  
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverload obj = new ConstructorOverload(2,"purnima");
		ConstructorOverload obj2 = new ConstructorOverload(3,"puri",25);
		ConstructorOverload obj3 = new ConstructorOverload(3,"puri",25,97);

	
		obj.display();
		obj2.display();
		obj3.display();
		
	}

}
