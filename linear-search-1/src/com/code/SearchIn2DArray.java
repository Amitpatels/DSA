package com.code;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		
		int [][] multiArray = {
				{2,3,5},
				{7,8,9},
				{10,11,46}
		}; 

		int ans[] = searchin2DArray(multiArray, 11);
		
		
	System.out.println("Search in array : "+Arrays.toString(ans));
	
	System.out.println("MIN value : "+ min(multiArray));
	
	System.out.println("MAX value : "+ max(multiArray));
		
	}

	static int[] searchin2DArray(int arr [][], int target) {
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] == target) {
					return new int[] {row,col};
				}
			}
		} 
		
		return new int[] {-1,-1};
	}
	
	//TODO
	static int min(int arr [][]) {
		
		int min = Integer.MAX_VALUE;
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] < min) {
					min = arr[row][col];
				}
			}
		} 
		
		return min;
	}
	
	
  static int max(int arr [][]) {
		
		int max = Integer.MIN_VALUE;
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] > max) {
					max = arr[row][col];
				}
			}
		} 
		
		return max;
	}
	
	
	
	
	
}
