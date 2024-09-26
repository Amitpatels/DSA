package org.recursion.question.level_1;

public class Concept {

	public static void main(String[] args) {
	
		fun(5);
	}

	static void fun(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println("Previous : "+n);
		//fun(n--); // cause stack overflow error
		fun(--n);
		
	}	
	
}
