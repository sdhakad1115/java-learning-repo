package core.java.interview.program;

public class ReverseInteger {

	public static void main(String[] args) {

		//1. using math 
		long num = 12345;
		long revNum = 0;
		while(num!=0) {
			revNum = revNum * 10 + num % 10;
			num = num /10;
		}
		System.out.println(revNum);
		
		//2. using StringBuffer reverse() method
		long num1 = 12345;
		String str = String.valueOf(num1);
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reversedInteger = sb.reverse();
		System.out.println(reversedInteger);
		
	}

}
