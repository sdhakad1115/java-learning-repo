package core.java.interview.program;


// Q. Reverse a given string ?

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Bangalore";
		
		//1. using for loop
		int len = str.length();
		String reverse = "";
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
			
		//2. using StringBuffer
		StringBuffer sb = new StringBuffer(str);
		StringBuffer revStr = sb.reverse();
		System.out.println(revStr);
		
	}
	
}
