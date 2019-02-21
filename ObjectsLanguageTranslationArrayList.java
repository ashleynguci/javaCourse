import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		ArrayList<WordPair> WordList = new ArrayList<WordPair>();
		System.out.print("Enter an English word: ");
		String engWord = input.nextLine();

		while (!engWord.equals("ok")) {
			System.out.print("Enter a Finnish word: ");
			String finWord = input.nextLine();
			WordList.add(new WordPair(engWord, finWord));
			System.out.println();
			System.out.print("Enter an English word: ");
			engWord = input.nextLine();
		}
		System.out.println("\n=== English-Finnish translation service (quit ends) ===");
		System.out.print("Enter an English word: ");
		String engInput = input.nextLine();
		while (!engInput.equals("quit")) {
			int count = 0;
			for (int i = 0; i < WordList.size(); i++) {

				if (WordList.get(i).getEnglishWord().equals(engInput)) {
					System.out.println(WordList.get(i).getFinnishWord());
					System.out.println();
					System.out.print("Enter an English word: ");
					engInput = input.nextLine();
					count = 1;
				}
			}
			if (count < 1) {

				System.out.println("Unknown word");
				System.out.println();
				System.out.print("Enter an English word: ");
				engInput = input.nextLine();

			}

		}
		System.out.print("Bye!");
	}

}
