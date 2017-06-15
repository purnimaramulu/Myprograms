package com.Myprograms;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = new int[] {4, 5, 3, 7,1, 8, 9};
		
		for(int i=0; i<=arr.length-1;i++){
			
			for(int j=0; j<=arr.length-1;j++){
		
				 int tmp = 0;
		            
				 if (arr[i] > arr[j]) {
		                tmp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = tmp;
		                
		            }
		        }
			
		}
		 for (int i = 0; i < arr.length; i++) {
		        System.out.print("\n " + arr[i]);
		    }
		 
		
	}

}
