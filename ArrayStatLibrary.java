
import java.util.Arrays;

public class ArrayStatLibrary {

	public static int min(int[] input) {
		int min = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			}
		}
		return min;
	}

	public static int max(int[] input) {
		int max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

	public static double median(int[] input) {
		int[] sorted = Arrays.copyOf(input, input.length);
		Arrays.sort(sorted);
		if (sorted.length % 2 == 0) {
			return (sorted[(sorted.length / 2) - 1] + sorted[sorted.length / 2]) / 2;
		} else {
			return sorted[sorted.length / 2];
		}
	}

	private static double sum(int[] input) {
		double sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return sum;
	}
	public static double mean(int[] input) {
		return sum(input)/input.length;
	}
	public static double standardDeviation(int[] input) {
		double different = 0;
		for (int i = 0;i<input.length;i++) {
			different += (input[i]-mean(input))*(input[i]-mean(input));
		}
		return Math.sqrt(different/(input.length-1));
	}
}
