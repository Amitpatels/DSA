package org.recursion.question.level_1;

public class DigitSum {

	public static void main(String[] args) {
		int ans = sum(12045);
		System.out.println(ans);
	}

	
	static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		
		System.out.println("Previous n%10 : "+(n%10) +" ,  (n/10) : " + (n/10));
		return (n%10) + sum(n/10);
	}
	
}
