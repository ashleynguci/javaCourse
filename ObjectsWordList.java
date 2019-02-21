import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsWordList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> WordList = new ArrayList<String>();
		System.out.print("Enter a word (quit ends): ");
		String word = input.nextLine();

		while (!word.equals("quit")) {
			WordList.add(word);
			System.out.print("Enter a word (quit ends): ");
			word = input.nextLine();

		}
		Collections.sort(WordList);
		for (int i = 0; i < WordList.size(); i++) {
			System.out.println(WordList.get(i));
		}
	}

}
