package org.recursion.question.level_2.arrays;

public class Sorted {

	public static void main(String[] args) {
		int[] arr = {1,2,5,4,8,9,10,11,34};
		//int index = 0;
		System.out.println(sorted(arr,0));
	}

	static boolean sorted(int[] arr, int index) {
		if(index == arr.length-1) {
			return true;
		}
		
		return arr[index] < arr[index+1] && sorted(arr, index+1);
		
	}
	
}
