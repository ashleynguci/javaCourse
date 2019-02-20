import java.util.Scanner;

public class ObjectsLanguageTranslationArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		WordPair[] ArrayLanguageTranslation = { new WordPair("bird", "lintu"), new WordPair("bus", "bussi"),
				new WordPair("car", "auto"), new WordPair("cat", "kissa"), new WordPair("dog", "koira") };
		System.out.print("Enter an English word: ");
		String engWord = input.nextLine();
		int count = 0;
		for (int i = 0; i < ArrayLanguageTranslation.length; i++) {
			if (engWord.equals(ArrayLanguageTranslation[i].getEnglishWord())) {
				System.out.print(ArrayLanguageTranslation[i].getFinnishWord());
				count++;
			}
		}
		if (count == 0) {
			System.out.print("Unknown word");
		}
	}

}
