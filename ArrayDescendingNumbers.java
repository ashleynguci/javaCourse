import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescendingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] Array = new double[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("Enter " + (i + 1) + ". number: ");
			Array[i] = Double.parseDouble(input.nextLine().replace(",","."));
		}
		Arrays.sort(Array);
		for (int i = 3; i >= 0; i--) {
			System.out.print(Array[i] + " ");
		}
	}

}
