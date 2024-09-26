package org.recursion.question.level_1;

public class NumberOfSteps {

	public static void main(String[] args) {
		int numberOfSteps = numberOfSteps(41);
		System.out.println("Number of steps : "+numberOfSteps);
	}

	public static int numberOfSteps(int num) {
		return helper(num,0);
	}
	
	private static int helper(int num, int steps) {
		if(num == 0) {
			return steps;
		}
		
		if(num %  2 == 0) {
			return helper(num/2, steps+1);
		}else {
			return helper(num-1, steps+1);
		}
	}
}
