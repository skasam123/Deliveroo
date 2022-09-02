package Karat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class badgesaccesss {
	public static  List<List<String>> analyzeRecords(final String[][] badgeRecords) {
        Map<String, Integer> map = new HashMap<>();

        final Set<String> invalidEnteriesSets = new HashSet<>();
        final Set<String> invalidExitsSets = new HashSet<>();

        for (String[] record : badgeRecords) {
            String name = record[0];
            String action = record[1];

            if (action.equals("exit")) {
                if (!map.containsKey(name) || map.get(name) != 1) {
                    invalidEnteriesSets.add(name);
                } else {
                    map.put(name, 0);
                }
            }

            if (action == "enter") {
                if (!map.containsKey(name) || map.get(name) == 0) {
                    map.put(name, 1);
                } else if (map.get(name) == 1) {
                    invalidExitsSets.add(name);
                }
            }
        }
        
        for (String name: map.keySet()) {
            if (map.get(name) > 0) {
                invalidExitsSets.add(name);
            }
        }

        List<List<String>> result = new ArrayList<>();
        List<String> invalidEnteriesList = new ArrayList<>(invalidEnteriesSets);
        List<String> invalidExits = new ArrayList<>(invalidExitsSets);
        result.add(invalidExits);
        result.add(invalidEnteriesList);

        return result;
    }
}
