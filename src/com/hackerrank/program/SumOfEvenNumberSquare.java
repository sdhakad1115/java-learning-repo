package com.hackerrank.program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfEvenNumberSquare {

	public static void main(String[] args) {

		 List<Integer> list = Stream.of(1,2,3,4,5,6,7,8,9,10).collect(Collectors.toList());
		 int sum = sumOfEvenNumberSquare(list);
		
		 System.out.println("Sum : " + sum);
	}
	
	public static int sumOfEvenNumberSquare(List<Integer> list) {
		
		// java 7
		int sum = 0;
		for (Integer item : list) {
			if(item % 2 == 0) {
				sum = sum + item * item;
			}
		}
		return sum;
		
		
		// java 8
	//	list.stream().filter( e -> e % 2 == 0).
		
		
	}

}
