import java.util.Scanner;
public class ObjectsTimePeriodProgram {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 TimePeriod period = new TimePeriod();
 System.out.println(period);
 for (int i = 1; i <= 2; i++) {
 System.out.print("Enter hours to add: ");
 int hours = Integer.parseInt(input.nextLine());
 System.out.print("Enter minutes to add: ");
 int minutes = Integer.parseInt(input.nextLine());
 period.addHours(hours);
 period.addMinutes(minutes);
 System.out.println(period);
 System.out.println();
 }
 input.close();
 }
}