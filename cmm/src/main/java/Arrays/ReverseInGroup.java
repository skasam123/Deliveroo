package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseInGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(4);
		arr.add(9);
		arr.add(10);
		arr.add(12);
		int k = 3;
		int i = 0;
		int b = k;
		int n = arr.size();
		if (k >= n)
			Collections.reverse(arr.subList(0, n));
		else {
			while (k < n) {
				Collections.reverse(arr.subList(i, k));
				i = k;
				k += b;

			}
			Collections.reverse(arr.subList(k - b, n));
			System.out.println("line30" + arr.toString());
		}
	}

}
