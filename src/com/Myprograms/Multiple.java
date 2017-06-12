package com.Myprograms;

interface car1
{
   public void myMethod();
   public void driving();
}
interface jeep
{
   public void myMethod();
   public void jeepdrive();
}
class Multiple implements car1, jeep
{
   public void myMethod()
   {
       System.out.println(" Multiple inheritance example using interfaces");
   }
   public void driving(){
	   System.out.println("car method is called now");
   }
   public void jeepdrive(){
	   System.out.println("jeep method is called now");
   }
  public static void main(String args[]){
	  Multiple obj= new Multiple();
	  obj.myMethod();
	  obj.driving();
      obj.jeepdrive();
	  
  }
  }
