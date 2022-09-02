package Sortings;

import java.util.Arrays;

public class Selection {
	
	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6, 7, 4 };
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

}
