package Queue;


import java.util.Stack;

public class Queue2 {
	static class Queue {
		Stack<Integer> stack1;
		Stack<Integer> stack2;
	}

	static void push(Stack<Integer> stack1, int new_data) {
		stack1.push(new_data);
	}

	static int pop(Stack<Integer> stack1) {
		if (stack1.isEmpty()) {
			System.out.println("Stack Underflow");
			System.exit(0);
		}

		return stack1.pop();
	}

	static void enQueue(Queue q, int x) {
//		push(q.stack1, x);
		q.stack1.push(x);
	}

	static int deQueue(Queue q) {
		int x;

		if (q.stack1.isEmpty() && q.stack2.isEmpty()) {
			System.out.println("Q is empty");
			System.exit(0);
		}

		if (q.stack2.isEmpty()) {
			while (!q.stack1.isEmpty()) {
				x = q.stack1.pop();
				push(q.stack2, x);
			}
		}
		x = pop(q.stack2);
		return x;
	}

	public static void main(String args[]) {
		Queue q = new Queue();
		q.stack1 = new Stack<>();
		q.stack2 = new Stack<>();
		enQueue(q, 1);
		enQueue(q, 2);
		enQueue(q, 3);

		System.out.print(deQueue(q) + " ");
		System.out.print(deQueue(q) + " ");
		System.out.println(deQueue(q) + " ");
		enQueue(q, 4);
		System.out.print(deQueue(q) + " ");

	}
}