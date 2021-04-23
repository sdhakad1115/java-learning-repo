package core.java.interview.program;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {

		String str = "@Bangalore #%*India!!";
		
		// we can use regex for this problem.
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
		
	}

}
