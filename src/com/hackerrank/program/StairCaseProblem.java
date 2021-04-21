
package com.hackerrank.program;

public class StairCaseProblem {

	public static void main(String[] args) {

		stairCase(6);
		
	}
	
	public static void stairCase(int n) {
		
		// for row 
		for (int i = 1; i <=n; i++) {
			
			
			for (int j = 1; j <= n-i ; j++) {
				
				System.out.print(" ");
			}
			
			for(int k = 1 ; k<=i; k++) {
			 System.out.print("#");
			}
			
			System.out.println();
			
		}
		
	}

}
