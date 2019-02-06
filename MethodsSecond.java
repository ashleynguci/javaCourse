import java.util.Scanner;

public class MethodsSecond {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());
		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());
		System.out.print("\n");
		printRectangle(width, height);
	}

	public static void printRectangle(int w, int h) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print("x");
			}
			System.out.println();
		}
	}
}
