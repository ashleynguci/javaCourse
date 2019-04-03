import java.util.Scanner;

public class DivisorProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		String StringInput = input.nextLine();
		System.out.println();
		try {
			int numberInput = Integer.parseInt(StringInput);
			int countDivisor = 0;
			if (numberInput <= 0) {
				System.out.print("The input is not a positive integer");
			} else {
				for (int i = 1; i <= numberInput; i++) {
					if (numberInput % i == 0) {
						countDivisor++;
					}
				}
				System.out.print(numberInput + " has " + countDivisor + " divisors");
			}
		} catch (NumberFormatException nfe) {
			System.out.print("The input is not a positive integer");
		}
		input.close();
	}

}
