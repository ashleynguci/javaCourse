import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter your hourly wage: ");
		Double wage = Double.parseDouble(input.nextLine().replace(",", "."));
		System.out.print("Enter the number of days: ");
		int day = Integer.parseInt(input.nextLine());
		int[] hour = new int[day];
		for (int i = 0; i < day; i++) {
			System.out.print("Hours worked on day " + (i+1) + " : ");
			hour[i] = Integer.parseInt(input.nextLine());
		}
		int sum = IntStream.of(hour).sum();
		System.out.println("Total work hours is " + sum);
		double pay = 0;
		for (int i = 0; i < day; i++) {

			if (hour[i] <= 8) {
				pay += hour[i] * wage;
			} else {
				pay += hour[i] * wage + (hour[i] - 8) * wage / 2;
			}

		}
		System.out.println("Gross pay is "+twoDecimals.format(pay).replace(".",","));
		System.out.print("You entered the following daily hours: ");
		for (int i = 0; i < day; i++) {
			System.out.print(hour[i]+ " ");
		}
	}

}
