package core.java.interview.program;

//Q. find the missing number for a given number

public class FindMissingNumverInArray {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5, 6, 7, 9, 10};
		
		int sum1  = 0;
		
		// calculate the sum for given array
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		
		// calculate the sum till max number Eg: 10
		int sum2 = 0;
		for(int j = 1; j <= 10; j++) {
			sum2 = sum2 + j;
		}
		
		int missingNumber = sum2 - sum1;
		System.out.println(missingNumber);
		
	}

}
