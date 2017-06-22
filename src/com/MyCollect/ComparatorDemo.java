package com.MyCollect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class GietStudent{
	int rollnumber;
	String stuName; 
	int marks;
	
	GietStudent(int rollnumber,String stuName,int marks){
		this.rollnumber= rollnumber;
		this.stuName = stuName;
		this.marks = marks;
	}
	
}

class marks implements Comparator<GietStudent>{
	public int compare(GietStudent i1, GietStudent i2){
		if(i1.marks== i2.marks)
			return 0;
		else if(i1.marks>i2.marks)
			return 1;
		else 
			return -1;
		
	}
	
}

class studentName implements Comparator<GietStudent>{
	public int compare(GietStudent o1,GietStudent o2){
		return o1.stuName.compareTo(o2.stuName);
	}
}
public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<GietStudent> All = new ArrayList<GietStudent>();
		All.add(new GietStudent(77,"purnima",77));
		All.add(new GietStudent(43,"sasi",80));
		All.add(new GietStudent(46,"architha",90));
      
		Collections.sort(All,new marks());
		
		for(GietStudent stu:All){
			System.out.println(stu.marks+""+stu.rollnumber+""+stu.stuName);
		}
		System.out.println("after sorting");
		
		Collections.sort(All, new studentName());
		
		for(GietStudent name: All){
			System.out.println(name.stuName+""+name.marks+""+name.rollnumber);
		}
		
	}

}
