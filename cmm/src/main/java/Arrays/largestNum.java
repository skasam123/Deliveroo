package Arrays;

import java.util.Arrays;

public class largestNum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5,6,7};
		String[] arr2 = {"1", "2", "4", "5","6","7"};
		String mm = LargestNum(arr2);
		System.out.println("line11{}" + mm);
	}

	private static String LargestNum(String[] arr) {

		Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        String result = new String();

        for (int i=0;i<arr.length;i++){
            result += arr[i];
        }
        return result.charAt(0)=='0'?"0": result;

	}

}
