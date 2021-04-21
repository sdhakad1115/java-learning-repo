import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the integer number \t ");
		
		int n = scanner.nextInt();
		
		int sum = 0;
		
		for(int i=1; i< n; i++) {
			if(n%i==0) {
				sum = sum + i;
			}
		}
		if(n==sum) {
			System.out.println("Perfect Number ");
		}else {
			System.out.println("Not a Perfect Number");
		} 
		
		scanner.close();
	}
}
