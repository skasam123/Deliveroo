package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;



class DupArray
{
   static void removeDups(int[] arr, int n)
   {
       HashMap<Integer,
               Boolean> mp = new HashMap<>();

       for (int i = 0; i < n; ++i)
       {
           if (mp.get(arr[i]) == null)
               System.out.print(arr[i] + " ");
           mp.put(arr[i], true);
       }

   }

   public static void main(String[] args)
   {
       int[] arr = { 1, 2, 1, 3, 7, 2, 4, 2 };
       int n = arr.length;
       removeDups(arr, n);
       System.out.println();
       removeDupsSet(arr, n);
       int[] arr1 = new int[] {1,3,4,4}; //num are ranging only from 1-4;
       System.out.println("dup is " + finddup(arr1));
       

   }

	private static int finddup(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			int index = Math.abs(arr1[i]) - 1;
			if (arr1[index] < 0)
				return Math.abs(arr1[i]);
			else
				arr1[index] = -arr1[index];
		}
		return -1;
	}

	private static void removeDupsSet(int[] arr, int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; ++i) {
			if (!(set.contains(arr[i]))) {
				set.add(arr[i]);
			}
		}
		System.out.println(set.toString());
	}
}
