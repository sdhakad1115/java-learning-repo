
package com.hackerrank.program;
import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String \n");
		String str = scan.nextLine();
		
		System.out.println("Enter the max length can be for givan string");
		long maxStrLength = scan.nextLong();
		
		long letterCount = repeatedString(str, maxStrLength);
		
		System.out.println("letterCount ::  " +  letterCount);
		
		scan.close();
	}

	
	public static long repeatedString(String s , long length) {
		
		int strLength = s.length();
		long q=0, r=0;
		
		q = length / strLength;
		
		r = length % strLength;
		
		long partialStrLength = (r==0) ? 0 : r;
		
		
		long count = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLength);
		
		return count;
		
		
	}
	
	
	
	
	
	public static long getLetterCount(String str, long strLength) {
		
		long count = 0;
		
		for(int i = 0; i<strLength; i++) {
			
			if(str.charAt(i) == 'a') {
				count++;
			}
			
		}
		
		return count;
		
	}
}
