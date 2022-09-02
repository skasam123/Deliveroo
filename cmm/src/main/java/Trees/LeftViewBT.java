package Trees;

import java.util.LinkedList;
import java.util.Queue;

import Trees.CountNodes.Node;

public class LeftViewBT {
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

		leftView(n);
	}

	private static void leftView(Node n) {
		
		Queue<Node> q = new LinkedList<>();
		q.add(n);
		
		while (!q.isEmpty()) {
			int size = q.size();

			for (int i = 1; i <= size; i++) {
				Node temp = q.poll();

				if (i == 1 && temp != null)
					System.out.println(temp.data);

				if (temp != null && temp.left != null)
					q.add(temp.left);

				if (temp != null && temp.right != null)
					q.add(temp.right);
			}

		}
		
		
	}

}
