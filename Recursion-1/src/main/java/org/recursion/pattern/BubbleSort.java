package org.recursion.pattern;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int data [] = {2,5,3,6,1,4};
		bubble(data,data.length-1,0);
		System.out.println("Bubble Sort : "+Arrays.toString(data));
	}

	static void bubble(int arr[], int row, int col) {
		
		if(row == 0) {
			return;
		}
		
		
		if(col < row) {
			
			if(arr[col] > arr[col +1]) {
				int temp = arr[col];
				arr[col] = arr[col+1];
				arr[col+1] = temp;
			}
			
			bubble(arr,row,col+1);
		}
		else {
			bubble(arr,row-1,0);
		}
		
	}
	
	
}
