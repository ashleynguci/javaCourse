import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first string: ");
		String input_ = input.nextLine();
		int number = 0;
		while (input_.length() != 0) {
			number++;
			System.out.print("Enter next string (empty ends): ");
			input_ = input.nextLine();
		}
		System.out.print("Number of input strings is " + number);

	}

}
