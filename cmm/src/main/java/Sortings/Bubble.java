package Sortings;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {

		int[] arr = { 1, 7, 8, 4, 5 };
		int indices = arr.length - 1;
		
		for (int i = 0; i < indices; i++) {
			boolean swapped = false;
			for (int j = 0; j < indices - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
