package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 5, 6 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("Have  a duplicate");
				System.exit(0);
			}
		}
		System.out.println("Not  a duplicate");

	}
}
