import java.util.Scanner;

public class RegExValidateUsernameFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter username: ");
		String email = input.nextLine();
		if(email.matches("[a]{1}[0-9]{7}(@myy\\.haaga-helia\\.fi){1}")) {
			System.out.print("OK");
		}
		else {
			System.out.print("Invalid username format");
		}
	}

}
