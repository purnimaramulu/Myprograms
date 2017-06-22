package com.MyCollect;



public class MyFactor implements Comparable{
	int EmpyoeeID;
	String 	EmployeeName;
	double Salary;
	static int i;
	

public MyFactor(String ename, double sal,int j, int k) {
	EmpyoeeID = i++;
	EmployeeName = ename;
	Salary = sal;
}
public String toString(){
	return "EmpyoeeID"+EmpyoeeID+"\n"+"EmployeeName"+"\n"+Salary;
	
}
public int compareTo(Object i1){
	
	if(this.Salary==((MyFactor) i1).Salary)
return 0;
else if(this.Salary >( (MyFactor) i1).Salary)
	return 1;

else 
	return -1;

	
}

}