import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter username: ");
		String user = input.nextLine();
		System.out.print("Enter password: ");
		String pass = input.nextLine();
		if(validatePassword(user,pass)==true) {
			System.out.print("OK");
		}
		else {
			System.out.print("NOT OK");
		}
	}
	public static boolean validatePassword(String name, String pass) {
		if(pass.length()<8) {
			return false;
		}
		else {
			if(pass.contains(name.toLowerCase())== true) {
				return false;
			}
			else {
				return true;
			}
		}
	}

}
