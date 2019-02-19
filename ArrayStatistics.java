import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayStatistics {

	public static void main(String[] args) {
		DecimalFormat one = new DecimalFormat("0.0");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int index = Integer.parseInt(input.nextLine());
		if (index < 3) {
			System.out.print("Sorry, at least 3 values required");
		} else {
			int[] inputArray = new int[index];
			for (int i = 0; i < index; i++) {
				System.out.print("Enter an integer: ");
				inputArray[i] = Integer.parseInt(input.nextLine());
			}
			ArrayStatLibrary a = new ArrayStatLibrary();
			System.out.println();
			System.out.println("n = " + index);
			System.out.println("Min: " + a.min(inputArray));
			System.out.println("Max: " + a.max(inputArray));
			System.out.println("Median: " + one.format(a.median(inputArray)).replace(".", ","));
			System.out.println("Mean: " + one.format(a.mean(inputArray)).replace(".", ","));
			System.out.println(
					"Sample standard deviation: " + one.format(a.standardDeviation(inputArray)).replace(".", ","));
			System.out.print("Sample data: ");
			for (int i = 0; i < index; i++) {
				System.out.print(inputArray[i] + " ");
			}
		}
	}

}
