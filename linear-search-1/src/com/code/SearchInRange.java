package com.code;

public class SearchInRange {

	public static void main(String[] args) {
	
		int arr[] = {2,4,43,7,9,5,4,3,6,3,7,4,654,345,34,6445,346,45};
		System.out.println(linearSearchIndex(arr,654,3,17));
	}

	public static int linearSearchIndex(int arr[], int target, int startIndex, int endIndex) {

		if(arr.length == 0) {
			return -1;
		}
		
		for(int index = startIndex; index <= endIndex; index++) {
            // check for element at every index if it is = target
			int element = arr[index];
			if(element == target) {
				return index;
			}
		}
		
		return -1;
	}
	
	
}
