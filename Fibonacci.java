
public class Fibonacci {

	public int[] getNumbers(int numberOfFibonacci) {
		int count = 2;
		int[] FibonacciArray = new int[numberOfFibonacci];
		FibonacciArray[0] = 0;
		FibonacciArray[1] = 1;
		while (count < numberOfFibonacci) {
			FibonacciArray[count] = FibonacciArray[count - 1] + FibonacciArray[count - 2];
			count++;

		}
		return FibonacciArray;
	}
}
