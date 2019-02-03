import java.util.Scanner;

public class IntegerDivision {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter dividend: ");
		int dividend = Integer.parseInt(input.nextLine());
		System.out.print("Enter divisor: ");
		int divisor = Integer.parseInt(input.nextLine());
		System.out.print(
				dividend + " /" + divisor + " = " + dividend / divisor + ", the remainder is " + dividend % divisor);
	}

}
