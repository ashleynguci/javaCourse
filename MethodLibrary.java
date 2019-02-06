
public class MethodLibrary {
	public static int factorial(int num) {
		int result = 1;
		if (num == 0) {
			return (result);
		} else {
			return num * factorial(num - 1);

		}

	}

}
