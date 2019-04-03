import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("=== Password Validation ===");
		System.out.print("Enter username: ");
		String username = input.nextLine();
		System.out.print("Enter password: ");
		String password = input.nextLine();

		if (checkPassword(username, password) == false) {
			System.out.print("Invalid password");
		} else {
			System.out.print("Password ok");
		}
		input.close();
	}

	public static boolean checkPassword(String username, String password) {
		if (password.length() < 6) {
			return false;
		} else if (password.toLowerCase().contains(username.toLowerCase()) == true) {
			return false;
		} else if (password.matches(".{0,}[0-9]{1,}.{0,}") == false) {
			return false;
		} else {
			return true;
		}
	}
}