import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = input.nextLine();
		System.out.println(removeExtraSpace(inputString));

	}

	public static String removeExtraSpace(String input) {
		String inputString = input.replaceAll("\\s{2,}", " ");
		return ("\""+inputString+"\"");
	}

}
