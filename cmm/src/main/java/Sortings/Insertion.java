package Sortings;

import java.util.Arrays;
import java.util.Collections;

public class Insertion {
	public static void main(String[] args) {

		int[] arr = { 3, 1, 7, 4, 5, 9 };
		int size = arr.length;

		for (int step = 1; step < size; step++) {
			int key = arr[step];
			int j = step - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = key;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
