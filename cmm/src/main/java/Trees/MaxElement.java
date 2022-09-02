package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElement {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int d) {

			this.data = d;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(3);
		n.left.left = new Node(4);
		n.left.right = new Node(5);
		n.right.left = new Node(6);
		n.right.right = new Node(7);

		serachElement(n);
		int max = maxElement(n);
		System.out.println("line 46 {}" + max);

	}

	private static int maxElement(Node n) {
		if (n == null) {
			return Integer.MIN_VALUE;
		}

		int root = n.data;
		int left = maxElement(n.left);
		int right = maxElement(n.right);

		if (left > root)
			root = left;
		if (right > root)
			root = right;

		return root;

	}

	private static void serachElement(Node n) {
		int key = 9;
		Queue<Node> q = new LinkedList<>();
		if (n == null)
			System.out.println("its  a null tree");

		q.add(n);

		while (!(q.isEmpty())) {
			Node temp = q.poll();
			if (temp.data == key) {
				System.out.println("Its a  match");
				break;
			}

			if (temp.left != null) {
				q.add(temp.left);
			}

			if (temp.right != null) {
				q.add(temp.right);
			}
		}
		System.out.println("its no found");

	}
	
	
	

}
