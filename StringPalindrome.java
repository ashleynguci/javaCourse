import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:  ");
		String text = input.nextLine();
		if(isPalindrome(text)==true) {
			System.out.println("The text is a palindrome.");
		}
		else {
			System.out.println("No palindrome");

		}
		
	}

	public static boolean isPalindrome(String input) {
		if (input.matches("[a-zA-Z\\s,.:;!?\'\"-]{1,}") == false) {
			return false;
		}
		char[] charArray = input.toLowerCase().replaceAll("[^a-zA-Z]{1,}", "").toCharArray();
		if (charArray.length < 1) {
			return false;
		}
		char[] reverseArray = new char[charArray.length];
		for (int i = 0, j = charArray.length - 1; i < charArray.length && j >= 0; i++, j--) {
			reverseArray[i] = charArray[j];
		}
		if (Arrays.equals(charArray, reverseArray)) {
			return true;
		} else {
			return false;
		}
	}

}
