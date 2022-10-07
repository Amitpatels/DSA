package com.code;

public class SearchMinNumber {

	public static void main(String[] args) {
		
		int arr[] = {2,4,6,1,8,6,7,5,98};
		
		System.out.println("smallest element in array : "+min(arr));
		System.out.println("biggest element in array : "+max(arr));

	}
	
	static int min(int arr[]) {
		
		int ans = arr[0];
		for(int i=1;i< arr.length;i++) {
			if(arr[i]<ans) {
				ans = arr[i];
			}
		}
		
		return ans;
	}

	static int max(int arr[]) {
		
		int ans = arr[0];
		for(int i=1;i< arr.length;i++) {
			if(arr[i]>ans) {
				ans = arr[i];
			}
		}
		
		return ans;
	}

	
}
