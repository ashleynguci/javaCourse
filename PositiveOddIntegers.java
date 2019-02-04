import java.util.Scanner;

public class PositiveOddIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive odd integer: ");
		String input_ = input.next();
		while (!input_.equals("quit")) {

			try {
				int newInt = Integer.parseInt(input_);
				if (newInt > 0 && newInt % 2 == 1) {
					System.out.println("  OK\n");
					System.out.print("Enter a positive odd integer: ");
					input_ = input.next();
					continue;
				} else {
					System.out.println("  " + input_ + " is not a positive odd integer\n");
					System.out.print("Enter a positive odd integer: ");
					input_ = input.next();
				}
			} catch (NumberFormatException ex) {
				System.out.println("  \'" + input_ + "\'" + " is not a positive odd integer\n");
				System.out.print("Enter a positive odd integer: ");
				input_ = input.next();
			}

		}
		System.out.println("  Bye!");
	}
}
