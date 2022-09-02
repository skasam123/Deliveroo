package Stacks;

import java.util.LinkedList;
import java.util.Queue;

class Stack2 {
	Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();

	void remove() {
		if (q1.isEmpty())
			return;

		while (q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}

		q1.remove();

		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}

	void add(int x) {
		q1.add(x);
	}

	int top() {
		if (q1.isEmpty())
			return -1;

		while (q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}

		int temp = q1.peek();

		q1.remove();

		q2.add(temp);

		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
		return temp;
	}

	int size() {
		return q1.size();
	}

	public static void main(String[] args) {
		Stack2 s = new Stack2();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);

		System.out.println("current size: " + s.size());
		System.out.println(s.top());
		s.remove();
		System.out.println(s.top());
		s.remove();
		System.out.println(s.top());
		System.out.println("current size: " + s.size());
	}
}

