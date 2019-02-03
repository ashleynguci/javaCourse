import java.text.DecimalFormat;
import java.util.Scanner;

public class DiscountPrice {

	public static void main(String[] args) {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter original price: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter discount percentage: ");
		double percent = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		double finalprice = price * (100 - percent) / 100;
		System.out.println("The final price is: " + twoDecimals.format(finalprice).replace('.', ','));

	}

}
