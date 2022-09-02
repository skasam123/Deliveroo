package Karat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Commonpairs {
	static void findCommonCourses(String[][] enrollments) {
		Map<String, Set<String>> output = new HashMap<>();
		Map<String, Set<String>> eIdCourses = new HashMap<>();

		for (String[] enrollment : enrollments) {
			eIdCourses.putIfAbsent(enrollment[0], new HashSet<String>());
			eIdCourses.get(enrollment[0]).add(enrollment[1]);
		}

		List<String> enrolList = new ArrayList<>(eIdCourses.keySet());

		for (int i = 0; i < enrolList.size(); i++) {
			for (int j = i + 1; j < enrolList.size(); j++) {
				output.putIfAbsent(enrolList.get(i) + "," + enrolList.get(j), new HashSet<String>());
				Set<String> input1 = new HashSet<>(eIdCourses.get(enrolList.get(i)));
				Set<String> input2 = new HashSet<>(eIdCourses.get(enrolList.get(j)));
				input1.retainAll(input2);
				output.get(enrolList.get(i) + "," + enrolList.get(j)).addAll(input1);
			}
		}

		Map<String, Set<String>> output = findCommonCourses(enrollments3);
		output.forEach((k, v) -> System.out.println(k + "," + v));
	}
}

