package Karat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		String[][] logs1 = new String[][] { { "58523", "user_1", "resource_1" },
	        { "62314", "user_2", "resource_2" },
	        { "54001", "user_1", "resource_3" },
	        { "200", "user_6", "resource_5" },
	        { "215", "user_6", "resource_4" },
	        { "54060", "user_2", "resource_3" },
	        { "53760", "user_3", "resource_3" },
	        { "58522", "user_22", "resource_1" },
	        { "53651", "user_5", "resource_3" },
	        { "2", "user_6", "resource_1" },
	        { "100", "user_6", "resource_6" },
	        { "400", "user_7", "resource_2" },
	        { "100", "user_8", "resource_6" },
	        { "54359", "user_1", "resource_3"}, };
		HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();

		for (int i = 0; i <= logs1.length - 1; i++) {
			if (map.get(logs1[i][1]) != null) {
				List<Integer> l = map.get(logs1[i][1]);
				l.add(Integer.parseInt(logs1[i][0]));
				map.put(logs1[i][1], l);
			} else {
				List<Integer> l = new ArrayList<Integer>();
				l.add(Integer.parseInt(logs1[i][0]));
				map.put(logs1[i][1], l);
			}
		}

		System.out.println(map);

		for (Entry<String, List<Integer>> entry : map.entrySet()) {

			List<Integer> m = map.get(entry.getKey());
			System.out.println(entry.getKey());
			System.out.print(Collections.min(m));
			System.out.print(",");

			System.out.print(Collections.max(m));
		}

	}
	
	

}
