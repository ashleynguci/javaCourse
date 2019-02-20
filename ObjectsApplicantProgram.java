import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Applicant[] applicantArray = new Applicant[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			String name = input.nextLine();
			System.out.print("Enter points: ");
			int point = Integer.parseInt(input.nextLine());
			applicantArray[i] = new Applicant(name, point);
		}

		System.out.print("\nEnter the minimum of required points: ");
		System.out.println();
		int minPoint = Integer.parseInt(input.nextLine());
		System.out.println("The following applicants achived the minimum of " + minPoint + " points: ");
		for (int i = 0; i < 4; i++) {
			if (applicantArray[i].getPoints() >= minPoint) {
				System.out.println(applicantArray[i].getName() + ", " + applicantArray[i].getPoints());
			}
		}

	}

}
