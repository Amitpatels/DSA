package org.recursion.question.level_1;

public class DigitProduct {

	public static void main(String[] args) {
		int ans = product(505);
		System.out.println("Answer : "+ ans);

	}

	static int product(int n) {
		System.out.println("Now n was : "+n+" and mod was ("+n+"%n) : "+n%10);
		
		 if(n%10 == n) {
			 System.out.println("Return condtion ("+n+"%10 == n) : "+n);
		     return n;
		 }
		 
		
		System.out.println("Previous "+n+"%10 : "+(n%10) +" ,  ("+n+"/10) : " + (n/10));
		return (n%10) * product(n/10);
	}
	
}
