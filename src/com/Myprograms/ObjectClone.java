package com.Myprograms;
class ObjectClone implements Cloneable{
	String name;
	int size;
	
	ObjectClone(String name,int size){
		this.name = name;
		this.size = size;
		
	}
	
	 public Object clone() throws CloneNotSupportedException{
		return super.clone();
		 
	 }
	 
	 
	public static void main(String[] args) throws CloneNotSupportedException {
    
		ObjectClone s1= new ObjectClone("purnima",123);
		ObjectClone s2= (ObjectClone)s1.clone();

		 System.out.println(s1.name+""+s1.size);
		 System.out.println(s2.name+""+s2.size);

		
	}


}
