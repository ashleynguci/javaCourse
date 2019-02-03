import java.util.Scanner;

public class DescendingIntegers {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = Integer.parseInt(input.nextLine());
		for (int i = integer; i > 0; i--) {
			System.out.print(i + " ");
		}
	}

}
