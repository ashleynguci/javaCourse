
public class ObjectsWordPairProgram {

	public static void main(String[] args) {
		WordPair wordOne = new WordPair("class", "luokka");
		WordPair wordTwo = new WordPair("object", "olio");
		WordPair wordThree = new WordPair("variable", "muuttuja");
		System.out.println(wordOne.getEnglishWord() + " = " + wordOne.getFinnishWord());
		System.out.println(wordTwo.getEnglishWord() + " = " + wordTwo.getFinnishWord());
		System.out.println(wordThree.getEnglishWord() + " = " + wordThree.getFinnishWord());

	}

}
