package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
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

		countnodes(n);
	}

	private static void countnodes(Node n) {
		Queue<Node> q = new LinkedList<>();
		q.add(n);
		int fullNodes = 0 ;
		Node temp;
		Node deepnode = null;
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.left != null && temp.right != null) {
				fullNodes++;
			}
			deepnode = temp;
			if (temp.left != null) {
				q.add(temp.left);
			}

			if (temp.right != null) {
				q.add(temp.right);
			}
		}
		System.out.println("line49" + fullNodes);
		System.out.println("line50" + deepnode.data);

		
	}

}
