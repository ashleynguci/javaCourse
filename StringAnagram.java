import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String firstString = input.nextLine();
		System.out.print("Enter second string: ");
		String secondString = input.nextLine();
		if (isAnagram(firstString, secondString) == true) {
			System.out.print("Anagram!");
		} else {
			System.out.print("No anagram.");
		}
	}

	public static boolean isAnagram(String firstInput, String secondInput) {
		if (firstInput.matches("[a-zA-Z\\s,.]{1,}") == false || secondInput.matches("[a-zA-Z\\s,.]{1,}") == false) {
			return false;
		}
		char[] charFirst = firstInput.toLowerCase().replaceAll("[^a-zA-Z]{1,}", "").toCharArray();
		char[] charSecond = secondInput.toLowerCase().replaceAll("[^a-zA-Z]{1,}", "").toCharArray();
		if (charFirst.length < 1 || charSecond.length < 1) {
			return false;
		}
		Arrays.sort(charFirst);
		Arrays.sort(charSecond);
		if (Arrays.equals(charFirst, charSecond)) {
			return true;
		} else {
			return false;
		}

	}
}
