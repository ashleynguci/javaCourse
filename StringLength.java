import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String input_ = input.nextLine();
		int length = input_.length();
		String quit = "quit";
		if (input_.equals(quit)) {
			System.out.print("The total length is 0");
		} else {
			while (!input_.equals(quit)) {

				System.out.print("Enter a string: ");
				input_ = input.nextLine();
				length += input_.length();

			}
			
			System.out.print("The total length is " + (length-4));

		}
	}

}
