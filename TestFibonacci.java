
public class TestFibonacci {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		int[] array;

		array = fibonacci.getNumbers(4);
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();

		array = fibonacci.getNumbers(10);
		for (int x : array) {
			System.out.print(x + " ");
		}
	}

}
