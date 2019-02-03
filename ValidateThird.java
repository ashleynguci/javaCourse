import java.util.Scanner;

public class ValidateThird {

	public static void main(String[] args) {

		while (true) {
			System.out.print("Enter grade (0-5): ");
			Scanner input = new Scanner(System.in);

			String input_ = input.next();
			try {

				int newin = Integer.parseInt(input_);
				if (newin > 5) {

					throw new NumberFormatException();

				}
				System.out.print("OK");
				break;
			} catch (NumberFormatException ex) {
				System.out.println(input_ + " is not a valid  grade.");

				;
				continue;
			}

		}
	}
}
