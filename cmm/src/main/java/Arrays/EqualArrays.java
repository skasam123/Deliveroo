package Arrays;

import java.util.Arrays;

public class EqualArrays {

	public static void main(String[] args) {
		int[] A = {1,2,5,4,0};
		int[] B = {2,4,6,0,1};
	      Arrays.sort(A);
	      Arrays.sort(B);
	      for(int i = 0 ; i <= A.length-1 ; i++) {
	    	  if(A[i] != B[i]) {
	    		System.out.println("They are not equal");  
	    		break;
	    	  }
	    	  
	      }
	 	}

}
