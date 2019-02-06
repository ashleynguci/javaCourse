import java.util.Scanner;

public class MethodsFactorial {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.println(i + "! = " + factorial(i));
		}

	}

	public static int factorial(int num) {
		int result = 1;
		if (num == 0) {
			return (result);
		} else {
			return num * factorial(num - 1);

		}

	}

}
