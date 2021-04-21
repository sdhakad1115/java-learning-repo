import java.util.Scanner;

public class FindLonelyInteger {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the arraya size \n");
        int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enetr the array elements \n ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  scan.nextInt();
		}
		
		Integer lonelyInteger = lonelyInteger(arr);
		System.out.println("Lonely Integer in givan array is : " + lonelyInteger);
		
		scan.close();
		
	}

	public static Integer lonelyInteger(int[] arr) {
		
		
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			result ^=arr[i];
			
		}
		
		return result;
		
	}
	
	
	
}
