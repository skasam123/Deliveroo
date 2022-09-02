package Arrays;

public class maxSum {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 2, 2, 3, 4, 4, 4, -3, 2 };
		int max = arr[0];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

			if (sum > max) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println("sasa" + max);

	}

}
