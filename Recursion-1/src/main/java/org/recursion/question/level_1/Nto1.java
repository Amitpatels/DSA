package org.recursion.question.level_1;

public class Nto1 {

	public static void main(String[] args) {
		
		System.out.println("Print N to 1");
		fun(5);
		System.out.println("Print 1 to N");
		reverseFun(5);
		System.out.println("Print both Nto1 & 1toN");
		bothFun(5);
	}
	
	
	static void fun(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		fun(n-1);
	}

	
	static void reverseFun(int n) {
		if(n==0) {
			return;
		}
		
		
		reverseFun(n-1);
		System.out.println(n);
		
	}
	
	static void bothFun(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		bothFun(n-1);
		System.out.println(n);
	}
	
}
