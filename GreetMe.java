import java.util.Scanner;
public class GreetMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		String name;
		System.out.print("Enter your first name: ");
		name = input.next( );
		System.out.print("Hello, "+name +" !");

	}

}
