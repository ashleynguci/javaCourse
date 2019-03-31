
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
public class ObjectsSortingWordPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<WordPair> WordPairs = new ArrayList<WordPair>();
		System.out.print("Enter an English word (quit ends): ");
		String englishInput = input.nextLine();
		String finnishInput ="";
		while(!englishInput.equals("quit")) {
			System.out.print("Enter a Finnish word: ");
			finnishInput = input.nextLine();
			
			WordPairs.add(new WordPair(englishInput,finnishInput));
			System.out.print("\n\nEnter an English word (quit ends): ");
			englishInput = input.nextLine();
		}
		Collections.sort(WordPairs, new WordPair_eng());
		System.out.println();
		System.out.println();
		for(WordPair WordPairobject : WordPairs) {
			System.out.println(WordPairobject.getEnglishWord()+" = "+WordPairobject.getFinnishWord());
		}
		
		Collections.sort(WordPairs, new WordPair_Fin());
		System.out.println();
		System.out.println();
		for(WordPair WordPairobject : WordPairs) {
			System.out.println(WordPairobject.getFinnishWord()+" = "+WordPairobject.getEnglishWord());
		}
		
		
		input.close();
	}

}
import java.util.Comparator;
public class WordPair_Fin implements Comparator<WordPair> {
public int compare(WordPair a, WordPair b) {
	return a.getFinnishWord().compareTo(b.getFinnishWord());
}
}
import java.util.Comparator;
public class WordPair_eng  implements Comparator<WordPair> {
public int compare(WordPair a, WordPair b) {
	return a.getEnglishWord().compareTo(b.getEnglishWord());
}
}

public class WordPair {

private String englishWord;
private String finnishWord;
public WordPair(String englishWord, String finnishWord) {
	super();
	this.englishWord = englishWord;
	this.finnishWord = finnishWord;
}
public String getEnglishWord() {
	return englishWord;
}

public String getFinnishWord() {
	return finnishWord;
}


}

