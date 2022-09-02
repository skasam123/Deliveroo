package Queue;

import java.util.Stack;

public class Queue {
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();

	void enqueue(int n) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(n);
		while (!s2.isEmpty())
			s1.push(s2.pop());

	}

	void deque() {

		if (s1.isEmpty()) {
			System.out.println("its a empty Stack");
			System.exit(0);
		}
		System.out.println(s1.pop());
	}

	public static void main(String[] args) {

		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		q.deque();

	}

}
