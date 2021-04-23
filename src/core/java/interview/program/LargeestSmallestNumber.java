package core.java.interview.program;

//Q. find the largest and smallest number from given array

import java.util.Arrays;


public class LargeestSmallestNumber {

	public static void main(String[] args) {

		int[] numbers = {23, -10, 45, 56, 4, 567};
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			
			if(numbers[i]> largest) {
				largest = numbers[i];
			}else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Given array elements :: " + Arrays.toString(numbers));
		System.out.println("Largest Number :: " + largest);
		System.out.println("Smallest Number :: " + smallest);
		
		
	}

}
