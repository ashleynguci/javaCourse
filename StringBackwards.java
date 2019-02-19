import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.print(reverse(str));
	}

	public static String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}

}
