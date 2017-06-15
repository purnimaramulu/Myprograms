package com.Myprograms;

import java.util.StringTokenizer;

public class StrinDelim {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("My name, is purnima");
		System.out.println("ecxept this :"+st.nextToken(","));
	}

}
