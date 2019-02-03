import java.text.DecimalFormat;
import java.util.Scanner;

public class CarSharing {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter driven kilometers: ");
		double kilometers = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter fuel consumption per 100 km: ");
		double fuel = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter fuel price per liter: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter number of people: ");
		int people = Integer.parseInt(input.nextLine().replace(',', '.'));
		double result = (fuel / 100 * kilometers * price) / people;
		System.out.println(
				"Each of the " + people + " people should pay " + twoDecimals.format(result).replace('.', ',') + " euros.");
	}

}
