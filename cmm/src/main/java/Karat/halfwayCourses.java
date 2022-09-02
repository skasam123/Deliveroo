package Karat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class halfwayCourses {
	 static String halfway_course(String[][] pairs) {
		    Map<String,String> inputMap = new HashMap<>();
		    List<String> outputList = new ArrayList<>();
		    String output ="";
		    for(String[] pair:pairs) {
		      inputMap.put(pair[0],pair[1]);      
		    }
		    List<String> keyList = new ArrayList<>(inputMap.keySet());
		    List<String> valueList = new ArrayList<>(inputMap.values());
		    keyList.removeAll(valueList);
		    String start = keyList.get(0);
		    outputList.add(start);
		    while(start!="" && outputList.size()<inputMap.size()) {
		      start=inputMap.get(start);
		      outputList.add(start);
		    }
		    return outputList.get((outputList.size()/2));
		  }
}
