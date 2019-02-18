import java.util.Scanner;

public class ArrayBloodTypes {

	public static void main(String[] args) {
		String[] bloodArray = new String[] { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };
		Scanner input = new Scanner(System.in);
		System.out.print("Enter blood type: ");
		String blood = input.nextLine();
		if(blood.equals("A+")) {
			System.out.print("10,0%");
		}
		else if(blood.equals("O-")) {
			System.out.print("20,0%");
		}
		else if(blood.equals("O+")) {
			System.out.print("20,0%");
		}
		else if(blood.equals("AB+")) {
			System.out.print("50,0%");
		}
		else {
			System.out.print("0,0%");
		}
	}

}
