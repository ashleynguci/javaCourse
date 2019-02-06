import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int input_ = Integer.parseInt(input.nextLine());
		MethodLibrary a  = new MethodLibrary();
		System.out.print(input_ +"! ="+a.factorial(input_));
	}

}

