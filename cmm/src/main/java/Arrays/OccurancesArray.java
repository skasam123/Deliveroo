package Arrays;

import java.util.HashMap;
import java.util.Stack;

public class OccurancesArray {

	public static void main(String[] args) {	

		int[] a = {4 ,2 ,2 ,2 ,3, 4 ,4 ,4 ,3 ,2 };
		int n = a.length;
		int k = 3;

		HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
            
            if(map.get(a[i]) == k)
    		System.out.println("lin25" + a[i]);
        }
        
		System.out.println("lin25");

	}

}


