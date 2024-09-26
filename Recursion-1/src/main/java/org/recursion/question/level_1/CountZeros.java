package org.recursion.question.level_1;

public class CountZeros {

	public static void main(String[] args) {
		
		System.out.println(countZero(3203030));

	}
	
	static int countZero(int n) {
		int c = 0;
		return helper(n,c);
	}

	private static int helper(int n, int c) {
		if(n == 0) {
			return c;
		}
		
		int rem = n % 10;
		if(rem == 0) {
			return helper(n/10, c+1);
		}else {
			return helper(n/10, c);
		}
		
		
	}
	
}
