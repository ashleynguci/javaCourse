import java.util.Arrays;
import java.util.Scanner;

public class ArrayLanguageTranslation {

	public static void main(String[] args) {

		String[] English = new String[] { "bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher" };
		String[] Finnish = new String[] { "lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "kouluttaa",
				"opettaja" };
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an English word: ");
		String eng = input.nextLine();
		if (!Arrays.asList(English).contains(eng)) {
			System.out.print("Unknown word");
		} else {
			for (int i = 0; i < English.length; i++) {
				if (eng.equals(English[i])) {
					System.out.print(Finnish[i]);
				}
			}
		}
	}
}
