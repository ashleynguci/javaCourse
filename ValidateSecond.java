import java.util.Scanner;

public class ValidateSecond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter grade (0-5): ");
		String input_ = input.next();
		try {
			int newin = Integer.parseInt(input_);
			if (newin > 5) {
				throw new NumberFormatException();
			}
			System.out.print("OK");
			;
		} catch (NumberFormatException ex) {
			System.out.print("Please enter an integer.");
		}

	}

}
