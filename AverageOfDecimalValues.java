import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageOfDecimalValues {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter first number (zero ends): ");
		double input_ = Double.parseDouble(input.nextLine().replace(',', '.'));
		if (input_ != 0) {
			int number = 0;
			double total = input_;
			while (input_ != 0) {
				number++;
				System.out.print("Enter next number (zero ends): ");
				input_ = Double.parseDouble(input.nextLine().replace(',', '.'));
				
				total += input_;
			}
			double avg = total / number;
			System.out.print("The average is " + twoDecimals.format(avg).replace('.', ','));
		} else {
			System.out.print("Nothing to calculate.");
		}
	}

}
