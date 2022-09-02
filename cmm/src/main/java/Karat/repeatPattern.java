package Karat;

import java.util.Arrays;
import java.util.List;

public class repeatPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] User1 = {"hi", "bye", "hello", "leetcode", "start", "end"};
		String[] User2 = {"hi", "stop", "leetcode", "start", "end", "bye"};
		
		System.out.println(repeatPattern(User1, User2));
	List<String> cc = repeatPattern(User1, User2);
		System.out.println(cc.size());
	}

	
	private static List<String> repeatPattern(String[] a, String[] b) {
	    //Fill up DP table.
	    int[][] dp = new int[a.length+1][b.length+1];

	    int maxLength = 0;

	    int maxUserinA = -1;

	    for(int i=1; i<=a.length; i++) {
	        for (int j=1; j<=b.length; j++) {

	            if (a[i-1] == b[j-1]) {
	                dp[i][j] = dp[i - 1][j - 1] + 1;

	                if(dp[i][j] > maxLength) {
	                    maxUserinA = i;
	                    maxLength = dp[i][j];
	                }
	            } else {
	                dp[i][j] = 0;
	            }
	        }
	    }
	    return Arrays.asList(a).subList(maxUserinA-maxLength, maxUserinA);
	}
}
