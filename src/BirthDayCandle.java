import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class BirthDayCandle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the no. of birthday candle : \n");

		int noOfCandle = scan.nextInt();

		System.out.println("Please enter the candles \n");

		int[] a = new int[noOfCandle];

		for (int i = 0; i < noOfCandle; i++) {

			a[i] = scan.nextInt();

		}

		int maxNumber = Arrays.stream(a).max().getAsInt();

		int count = 0;
		for (int num : a) {

			if (maxNumber == num) {
				count++;
			}

		}

		System.out.println("She blow out no of candles :: " + count);

		scan.close();
	}

}
