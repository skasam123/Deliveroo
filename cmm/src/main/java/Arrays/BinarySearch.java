package Arrays;

public class BinarySearch {

	public static void main(String[] args) {
	       int[] arr = { 1,2,3,4,5,6,8,9,10,14,16,19,22,23,25,26,27,29,31,34,35,36,38,39,40,45,46,48,50,51,52,57,59,60,61,63,67,68,69,71,75,76,77,79,81,82,83,86,87,88,90,92,93,94,95,96,98,99,100};
	       int start = 0;
	       int end = arr.length - 1;
	       int mid = 0;
	        int k = 93;
	        boolean found = false;
	       while(start <= end) {
	    	   mid = (start+end)/2;
	    	   if(arr[mid] == k) {
	    		   found = true;
	    		   break;
	    	   } else if(k < arr[mid]) {
	    		   end = mid-1;
	    	   } else {
	    		   start = mid+1;
	    	   }
	       }
	       if(found)
    		   System.out.println("we hae found" + mid);
	       else
    		   System.out.println("we hae not found");

	       
	 	}

}
