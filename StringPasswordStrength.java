import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter password: ");
		String inputPassword = input.nextLine();
		if(checkStrength(inputPassword)==true) {
			System.out.println("OK");
		}
		else {
			System.out.println("Not strong enough!");
		}
	}
	public static boolean checkStrength(String password) {
		int count = 0;
		if(password.length() >=8 && password.matches(".{0,}\\d{1,}.{0,}"))  {
			count++;
		}
		if(password.length() >=8 && password.matches(".{0,}[a-z]{1,}.{0,}")) {
			count++;
		}
		if(password.length() >=8 && password.matches(".{0,}[A-Z]{1,}.{0,}")) {
			count++;
		}
		if(password.length() >=8 && password.matches(".{0,}[\\W_]{1,}.{0,}")) {
			count++;
		}
		
		if(count >=3) {
			return true;
		}
		else {
			return false;
		}
	}

}
