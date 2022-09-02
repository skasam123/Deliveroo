package Karat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public static void main(String[] argv) {
		String tiles1 = "88844";
		String tiles2 = "99";
		String tiles3 = "55555";
		String tiles4 = "22333333";
		String tiles5 = "73797439949499477339977777997394947947477993";
		String tiles6 = "111333555";
		String tiles7 = "42";
		String tiles8 = "888";
		String tiles9 = "100100000";
		String tiles10 = "346664366";
		String tiles11 = "8999998999899";
		String tiles12 = "17610177";
		String tiles13 = "600061166";
		String tiles14 = "6996999";
		String tiles15 = "03799449";
		String tiles16 = "64444333355556";

		Solution sol = new Solution();
		boolean result = sol.complete(tiles1);
		System.out.println(result);
		boolean result1 = sol.complete(tiles2);
		System.out.println(result1);
		boolean result2 = sol.complete(tiles3);
		System.out.println(result2);
		boolean result3 = sol.complete(tiles4);
		System.out.println(result3);
		boolean result4 = sol.complete(tiles5);
		System.out.println(result4);
		boolean result5 = sol.complete(tiles6);
		System.out.println(result5);
		boolean result6 = sol.complete(tiles7);
		System.out.println(result6);
		boolean result7 = sol.complete(tiles8);
		System.out.println(result7);
		boolean result8 = sol.complete(tiles9);
		System.out.println(result8);
		boolean result9 = sol.complete(tiles10);
		System.out.println(result9);
		boolean result10 = sol.complete(tiles11);
		System.out.println(result10);
		boolean result11 = sol.complete(tiles12);
		System.out.println(result11);
		boolean result12 = sol.complete(tiles13);
		System.out.println(result12);
		boolean result13 = sol.complete(tiles14);
		System.out.println(result13);
		boolean result14 = sol.complete(tiles15);
		System.out.println(result14);
		boolean result15 = sol.complete(tiles16);
		System.out.println(result15);
		
//		System.out.println(sol.isCompleteHand(tiles16));

	}

	
	//working
	public static boolean isCompleteHand(String tiles)

	{
		if (tiles == null || tiles.length() == 0)
			return false;
		HashMap<Integer, Integer> map = new HashMap<>();
		int counter = 0;

		for (char c : tiles.toCharArray()) {
			/// c - 'a'
			int val = Integer.parseInt(String.valueOf(c));
			map.put(val, map.getOrDefault(val, 0) + 1);
		}

		for (int val : map.keySet()) {
			if (map.get(val) % 3 == 1) {
				return false;
			}

			if (map.get(val) % 3 == 2) {
				counter++;
			}
		}

		return counter == 1;
	}
	
	boolean complete(String tiles) {

		char[] JavaCharArray = new char[tiles.length()];

		for (int i = 0; i < tiles.length(); i++) {
			JavaCharArray[i] = tiles.charAt(i);
		}

		int pairs = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int k = 0; k <= JavaCharArray.length - 1; k++) {
			if (map.get(JavaCharArray[k]) == null) {
				map.put(JavaCharArray[k], 1);
			} else
				map.put(JavaCharArray[k], map.get(JavaCharArray[k]) + 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 3 == 2) {
				pairs++;
			}
			
			if (entry.getValue() % 3 == 1) {
				return false;
			}
		}

//			System.out.println(map);
//		System.out.println(pairs);

		if (pairs == 1) {
			return true;
		} else
			return false;

	}
}
