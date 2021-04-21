
package com.hackerrank.program;

public class PalidromeIndex {

	public static void main(String[] args) {

		String str = "abda";
		int len = str.length();

		int index = palindromeIndex(str, len);
		System.out.println(index);
		
		
	}

	private static int palindromeIndex(String str, int len) {
	
		int palindromeIndex = -1;
		for(int i = 0; i<len; i++) {
			
			if(str.charAt(i) != str.charAt(len -1 - i)) {
				
				String tempStr = str.substring(i + 1, len - i);
				
				boolean isPalindromeString = isPalindromeString(tempStr);
				if(isPalindromeString) {
					return i;
				}
				else {
					return len - 1 - i;
				}
				
			}
			
		}
		
		return palindromeIndex;
		
	}
	
	public static boolean isPalindromeString(String str) {
		
		int len = str.length();
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
		
	}

}
