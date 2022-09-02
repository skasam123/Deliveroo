package Arrays;

public class MinInRotatedSubArray {
	public static void main(String[] args) {
		int k = min();
		System.out.println(k);
	}

	private static int min() {
		int[] nums = {3,4,5,1,2};
	    if (nums.length == 1) {
	        return nums[0];
	    }
	    int left = 0;
	    int right = nums.length - 1;

	    if (nums[right] > nums[0]) {
	        return nums[0];
	    }

	    while (right >= left) {
	        int mid = left + (right - left) / 2;

	        if (nums[mid] > nums[mid + 1]) {
	            return nums[mid + 1];
	        }

	        if (nums[mid - 1] > nums[mid]) {
	            return nums[mid];
	        }

	        if (nums[mid] > nums[0]) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return Integer.MAX_VALUE;		
	}
	
}
