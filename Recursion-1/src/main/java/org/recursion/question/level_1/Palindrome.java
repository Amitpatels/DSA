package org.recursion.question.level_1;

public class Palindrome {

	public static void main(String[] args) {
		
		//rev1(12345);
		//System.out.println(sum);
		
		//System.out.println(rev2(12345));
		
		System.out.println("Is palindrome : "+palindrome(123454321));
	
	}
	
	static int sum = 0;
	
	static void rev1(int n) {
		
		if(n==0) {
			return;
		}
		
		int rem = n % 10;
		sum = sum * 10 + rem;
		rev1(n/10);
		
	}
	
	public static int rev2(int n) {
		//sometimes you might need some additional variable in the argument
		//in that case, make another function
		int digits = (int) (Math.log10(n)) + 1;
		return helper(n, digits);
	}

	private static int helper(int n, int digits) {
		if(n%10 == n) {
			return n;
		}
		
		int rem = n % 10;
		return rem * (int)(Math.pow(10, digits-1 )) + helper(n/10,digits-1);
	}
	
	static boolean palindrome(int n) {
		return n == rev2(n);
	}
	
}
