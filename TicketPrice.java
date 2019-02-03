import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketPrice {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter price for a single ticket: ");
		double single = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter price for a season ticket: ");
		double season = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter the number of bus trips per month: ");
		double trips = Double.parseDouble(input.nextLine().replace(',', '.'));
		if (single * trips > season) {
			System.out.println("Buying a season ticket is "
					+ twoDecimals.format(single * trips - season).replace('.', ',') + " euros cheaper.");
		} else if (single * trips < season) {
			System.out.println("Buying a single ticket is "
					+ twoDecimals.format(season - single * trips).replace('.', ',') + " euros cheaper.");
		} else {
			System.out.println("There is no difference in the price.");
		}

	}

}
