import java.text.DecimalFormat;
import java.util.Scanner;

public class AgentCommission {

	private static Scanner input;

	public static void main(String[] args) {
		double commission = 3.44 / 100;
		input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter selling price: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		double finalprice = price * commission;
		if (finalprice < 2400.00) {
			System.out.println("The commission is 2400,00");
		} else {
			System.out.println("The commission is " + twoDecimals.format(finalprice).replace('.', ',') + " euros");
		}
	}

}
