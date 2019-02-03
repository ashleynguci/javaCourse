import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter initial deposit: ");
		double deposit = Double.parseDouble(input.nextLine().replace(",","."));
		System.out.print("Enter interest rate: ");
		double interest = Double.parseDouble(input.nextLine().replace(",","."));
		System.out.print("Enter capital income tax rate: ");
		double taxRate =  Double.parseDouble(input.nextLine().replace(",","."));
		System.out.print("Enter number of years: ");
		int numberOfYear  = input.nextInt();
		double  finalRate = interest/100*(100-taxRate)/100;
		for(int i = 1; i < numberOfYear+1; i++) {
			 deposit = deposit*(1+finalRate);
			 System.out.println(i + ": "+twoDecimals.format(deposit).replace(".",","));
		}

	}

}
