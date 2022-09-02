package Stacks;

import java.util.LinkedList;
import java.util.Queue;


public class Stack {
	 static Queue<Integer> q1 = new LinkedList<Integer>();
     static Queue<Integer> q2 = new LinkedList<Integer>();
     
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
	}

	private void pop() {
		System.out.println(q1.peek());
	}

	private void push(int i) {

		q2.add(i);

		while (!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}
	
	

}
