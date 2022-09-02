package Arrays;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class SlidingWindow {

	public static void main(String[] args) {
	       int[] arr = { 1,2,3,4,5,6,8,9,11};
	       printMax(arr);
	       printMaxUsingHeap(arr, arr.length,4);
	}

	private static void printMaxUsingHeap(int[] arr, int n, int k) {
		Deque<Integer> Qi = new LinkedList<>();
		int i;
		for (i = 0; i < k; i++) {
			while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast();
			Qi.addLast(i);
		}
	
		for (; i < n; i++) {
			System.out.print(arr[Qi.peek()] + " ");
			while ((!Qi.isEmpty()) && Qi.peek() <= i - k) 
				Qi.removeFirst();
			while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) 
				Qi.removeLast();
			Qi.addLast(i);
		}
	
		System.out.print(arr[Qi.peek()]);
		
	}
	
	
	private static void printMax(int[] arr) {
		int n = 3;
		int max = 0;
		for (int i = 0; i <= (arr.length - 1 - n); i++) {
			max = arr[i];
			for (int j = 1; j <= n; j++) {
				if(arr[i+j] > max)
					max = arr[i+j];
			}
			System.out.println("max is" + max);

		}
	}

	
	
}
