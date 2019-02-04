import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int input_ = Integer.parseInt(input.nextLine());
		if (input_ < 0) {
			input_ = input_ * -1;
		}

		String number = Integer.toString(input_);
		String[] numberStrs = number.split("");
		int[] numbers = new int[numberStrs.length];
		int result = 1;
		for (int i = 0; i < numberStrs.length; i++) {

			// Note that this is assuming valid input
			// If you want to check then add a try/catch
			// and another index for the numbers if to continue adding the others (see
			// below)
			numbers[i] = Integer.parseInt(numberStrs[i]);
			result = result * numbers[i];
		}
		System.out.println(result);

	}

}
