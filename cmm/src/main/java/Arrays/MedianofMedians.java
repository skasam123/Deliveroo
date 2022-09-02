package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;


public class MedianofMedians {

	PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>(Collections.reverseOrder());
	PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
	
	public static void main(String[] args) {
		MedianofMedians med = new MedianofMedians();
		// TODO Auto-generated method stub
		med.insertNum(3);
		med.insertNum(5);
		med.insertNum(7);
		med.insertNum(9);
		med.findmedian();


		
	}

	
	private void insertNum(int n) {
		if (maxheap.isEmpty() || maxheap.peek() >= n) {
			maxheap.add(n);
		} else
			minheap.add(n);

		if (maxheap.size() > minheap.size() + 1) {
			minheap.add(maxheap.poll());

		} else if (maxheap.size() < minheap.size()) {
			maxheap.add(minheap.poll());

		}

	}
	
	private void findmedian() {
		if (maxheap.size() == minheap.size()) {
			System.out.print((maxheap.peek() + minheap.peek()) / 2.0);
		}
		System.out.print(maxheap.peek());
	}
	}
