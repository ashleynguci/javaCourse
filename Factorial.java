import java.util.Scanner;

public class Factorial {

	private static Scanner input;

	public static void main(String[] args) {
		System.out.print("Enter a non-negative integer: ");

		input = new Scanner(System.in);

		String input_ = input.next();
		try {
			int number = Integer.parseInt(input_);
			if(number<0) {
				throw new NumberFormatException();
			}
			int result = Factorial_(number);
			System.out.print(number + "! = " + result);

		}

		catch (NumberFormatException ex) {
			System.out.print("Please enter a non-negative integer. ");

		}

	}

	private static int Factorial_(int input) {
		int result = 1;
		if (input == 0) {
			return (result);
		} else {
			return input * Factorial_(input - 1);

		}
	}

}
