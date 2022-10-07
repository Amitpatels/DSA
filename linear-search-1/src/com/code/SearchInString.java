package com.code;

public class SearchInString {

	public static void main(String[] args) {
		
		String name = "Amit";
		char c = 'i';
		
		System.out.println(search(name,c));
		System.out.println(search2(name,c));
			
	}

	static boolean search(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		
		for(int i=0; i < str.length(); i++) {
			if(target == str.charAt(i)) {
				return true;	
			}
		}
		
		return false;
	}
	
	static boolean search2(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		
		for(char c : str.toCharArray()) {
			if(c == target) {
				return true;	
			}
		}
		
		return false;
	}
}
