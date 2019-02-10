import java.util.Scanner;
import java.lang.Math;
public class MethodsPrimes {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("How many primes: ");
		int number = Integer.parseInt(input.nextLine());
		int count;
		int initial = 3;
		
		if( number>=1) {
			System.out.print(2);
		}
		for (count = 2; count <=number;) {
			if ( isPrime(initial)==true) {
				count++;
				System.out.print(" "+initial);
			}
			initial++;
		}
		}
		
	public static boolean isPrime(int num) {
		if(num<2) {
			return  false;
		}
		for(int i =2; i<= Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
	
		}
		return true;
	}

}
