package com.code;

public class LinearSearchMain {

	public static void main(String[] args) {
		System.out.println("Hi all ....");
		int arr[] = {2,4,43,7,9,5};
		
		System.out.println("Basic linear Search index : "+SimpleLinearSearch.linearSearchIndex(arr, 9));
		
		System.out.println("Basic linear Search Value : "+SimpleLinearSearch.linearSearchElement(arr, 23));
		
		System.out.println("Basic linear Search boolean : "+SimpleLinearSearch.linearSearchElementByBoolean(arr, 23));
		
	}

}
