import java.text.DecimalFormat;
import java.util.Scanner;

public class DrivingCost {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter driven kilometers: ");
		double kilometers = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter amount of fuel consumed: ");
		double fuel = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter fuel price per liter: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		double cost = (fuel / kilometers) * price;
		System.out.println("The cost per kilometer is " + twoDecimals.format(cost).replace('.', ',') + " euros.");

	}

}
