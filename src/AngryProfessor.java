import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no. of test cases \n");
		int  testCases = scan.nextInt();
		
		
		for(int i = 0; i<testCases; i++) {
			
			System.out.println("Enter the no. of students \t");
			int n = scan.nextInt();
			
			System.out.println("Enter the threshold no. \n");
			int k = scan.nextInt();
			
			
			System.out.println("Enter the stundents arrival times \n");
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = scan.nextInt();
			}
			
			
			String professorDicison = angryProfessor(k, a);
			
			System.out.println(professorDicison);
			
		}
		
			scan.close();
		
	}
	
	public static String angryProfessor(int k, int[] a) {
		
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] <=0) {
				count++;
			}
		}
		return (count >=k) ? "NO" : "YES";
		
	}

}
