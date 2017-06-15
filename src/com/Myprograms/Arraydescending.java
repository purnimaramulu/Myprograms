package com.Myprograms;

public class Arraydescending {

	public static void main(String[] args) {
		int[] arr = new int[] {4, 5, 3, 7,1, 8, 9};

		for(int i=0; i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				int temp= 0;
				if(arr[i] < arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
						
			}
			
		}
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("the length of the array in descending"+ arr.length);
		
	}

}
