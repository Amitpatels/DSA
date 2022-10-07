package com.code;

public class SimpleLinearSearch {
	
	public static int linearSearchIndex(int arr[], int target) {

		if(arr.length == 0) {
			return -1;
		}
		
		for(int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		
		return -1;
	}
	
	
	public static int linearSearchElement(int arr[], int target) {

		if(arr.length == 0) {
			return -1;
		}
		
		for(int element :arr) {
			if(element == target) {
				return element;
			}
		}
		
		return Integer.MAX_VALUE;
	}
	
	public static boolean linearSearchElementByBoolean(int arr[], int target) {

		if(arr.length == 0) {
			return false;
		}
		
		for(int element :arr) {
			if(element == target) {
				return true;
			}
		}
		
		return false;
	}
}
