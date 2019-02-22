import java.time.LocalDate;
import java.util.Scanner;

public class MethodsPrintCalendar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int yearInput = Integer.parseInt(input.nextLine());
		System.out.print("Enter month: ");
		int monthInput = Integer.parseInt(input.nextLine());
		printCalendar(yearInput, monthInput);
		input.close();
	}

	public static void printCalendar(int year, int month) {
		int day = 1;
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		for (int i = 1; i <= 12; i++) {
			if (month == i) {
				System.out.println("\n > " + monthName[i - 1] + " " + year + " <");
			}
		}
		System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
		LocalDate myDate = LocalDate.of(year, month, 1);
		int dayOfWeek = myDate.getDayOfWeek().getValue();
		int daysInMonth = myDate.lengthOfMonth();
		for (int i = 0; i < dayOfWeek - 1; i++) {
			System.out.print("    ");
		}

		for (int i = 0; i <= (7 - dayOfWeek); i++) {

			System.out.printf("%4d", day);
			day++;
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			if (day <= daysInMonth) {
				for (int j = 0; j < 7; j++) {
					if (day <= daysInMonth) {
						System.out.printf("%4d", day);
						day++;
					}
				}
				System.out.println();
			}

		}

	}

}
