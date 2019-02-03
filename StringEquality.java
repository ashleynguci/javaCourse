import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String first = input.nextLine();
		System.out.print("Enter first string: ");
		String second = input.nextLine();
		if (first.equals(second)) {
			System.out.print("Equal");
		} else {
			System.out.print("Not equal");
		}

	}
}
