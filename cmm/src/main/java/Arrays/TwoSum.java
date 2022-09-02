package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 9, 8 };
		int target = 10;
		int[] s = twoSum(nums, target);
		System.out.println(Arrays.toString(s));

	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] { map.get(target - nums[i]), i };
			} else {
				map.put(nums[i], i);
			}
		}
		return new int[] { -1, -1 };
	}
}
