package Karat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class badgesaccess {
	private List<List<String>> solve(List<List<String>> input) {
		Map<String, List<String>> map = new HashMap<>();

		List<List<String>> result = new ArrayList<>();

		for (List<String> x : input) {
			if (map.containsKey(x.get(0))) {
				List y = map.get(x.get(0));
				y.add(x.get(1));
			} else {
				List<String> temp = new ArrayList<>();
				temp.add(x.get(1));
				map.put(x.get(0), temp);
			}
		}

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			List<String> list = entry.getValue();
			Collections.sort(list, new MySort());
			for (int i = 2; i < list.size(); i++) {
				int c = Integer.valueOf(list.get(i));
				int p = Integer.valueOf(list.get(i - 2));
				if (c - p <= 100) {
					List<String> res = new ArrayList<String>();
					res.add(entry.getKey());
					for (int j = i - 2; j < list.size(); j++) {
						int k = Integer.valueOf(list.get(j));
						if (k - p <= 100) {
							res.add(list.get(j));
						} else {
							break;
						}
					}

					result.add(res);
					break;
				}
			}

		}
		return result;

	}

	class MySort implements Comparator<String> {
		public int compare(String x, String y) {
			return Integer.valueOf(x) - Integer.valueOf(y);
		}
	}

	public static void main(String[] args) {
		List<List<String>> records = new ArrayList<>();

		records.add(Arrays.asList("Paul", "1355"));
		records.add(Arrays.asList("Jose", "835"));
		records.add(Arrays.asList("Jennifer", "1910"));
		records.add(Arrays.asList("Jose", "830"));
		records.add(Arrays.asList("Paul", "1315"));
		records.add(Arrays.asList("Chloe", "0"));
		records.add(Arrays.asList("Chloe", "1910"));
		records.add(Arrays.asList("Jose", "1615"));
		records.add(Arrays.asList("Jose", "1640"));
		records.add(Arrays.asList("Paul", "1405"));
		records.add(Arrays.asList("Jose", "855"));
		records.add(Arrays.asList("Jose", "930"));
		records.add(Arrays.asList("Jose", "915"));
		records.add(Arrays.asList("Jose", "730"));
		records.add(Arrays.asList("Jose", "940"));
		records.add(Arrays.asList("Jennifer", "1335"));
		records.add(Arrays.asList("Jennifer", "730"));
		records.add(Arrays.asList("Jose", "1630"));
		records.add(Arrays.asList("Jennifer", "5"));
		records.add(Arrays.asList("Jose", "830"));
		records.add(Arrays.asList("Chloe", "1909"));
		records.add(Arrays.asList("Zhang", "1"));
		records.add(Arrays.asList("Zhang", "10"));
		records.add(Arrays.asList("Zhang", "109"));
		records.add(Arrays.asList("Zhang", "110"));
		records.add(Arrays.asList("Amos", "1"));
		records.add(Arrays.asList("Amos", "2"));
		records.add(Arrays.asList("Amos", "400"));
		records.add(Arrays.asList("Amos", "500"));
		records.add(Arrays.asList("Amos", "503"));
		records.add(Arrays.asList("Amos", "504"));
		records.add(Arrays.asList("Amos", "601"));
		records.add(Arrays.asList("Amos", "602"));
		records.add(Arrays.asList("Paul", "1416"));

		badgesaccess h = new badgesaccess();
		System.out.println(h.solve(records));
	}

}
