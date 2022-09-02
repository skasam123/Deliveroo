package Arrays;

public class Maxproduct {

	public static void main(String[] args) {
		int[] nums = {0 ,1, 2, 3, 4, 5, 6, 9, 8};
		long m = maxProduct(nums, nums.length);
		System.out.println("{}" + m);
	}

	private static long maxProduct(int[] arr, int n) {
		int result = arr[0];
		n = arr.length;
		for (int i = 0; i < n; i++) {
			int mul = arr[i];
			for (int j = i + 1; j < n; j++) {
				result = Math.max(result, mul);
				mul *= arr[j];
			}
			result = Math.max(result, mul);
		}
		return result;
	}

}
