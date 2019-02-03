import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int int1 = Integer.parseInt(input.nextLine());
		System.out.print("Enter second integer: ");
		int int2 = Integer.parseInt(input.nextLine());
		int result = int1 + int2;
		System.out.print(int1 + " + " + int2 + " = " + result);
		input.close();
	}

}
