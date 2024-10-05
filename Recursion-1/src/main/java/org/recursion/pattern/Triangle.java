package org.recursion.pattern;

public class Triangle {

	public static void main(String[] args) {
		traingle(10, 0);
		System.out.println("\n\n================================================\n\n");
		normalTraingle(10,0);

	}

	static void traingle(int row, int col) {

		if (row == 0) {
			return;
		}

		if (col < row) {
			System.out.print("*");
			traingle(row, col + 1);
		} else {
			System.out.println();
			traingle(row - 1, 0);
		}

	}

	
	static void normalTraingle(int row, int col) {
		if(row == 0) {
			return;
		}
		
		if(col < row) {
			normalTraingle(row,col+1);
			System.out.print("*");
		}else {
			normalTraingle(row-1,0);
			System.out.println();
			
		}
		
		
	}
}
