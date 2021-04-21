import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of array : \n");
		int sizeOfArray = scan.nextInt();
		
		
		int[] a = new int[sizeOfArray];
		
		System.out.println("Enter the elements");
		for (int i = 0; i < sizeOfArray; i++) {
			
			a[i] = scan.nextInt();
			
		}
		
		int sum = 0;
		
		for (int i : a) {
			
			sum = sum + i;
		}
		
		System.out.println("Sum of givan array :: " + sum);
		
		scan.close();
	}

}
