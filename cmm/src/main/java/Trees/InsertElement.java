package Trees;

import java.util.LinkedList;
import java.util.Queue;

import Trees.MaxElement.Node;

public class InsertElement {
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
		Node n = new Node (1);
		n.left = new Node (2);
		n.right = new Node (3);
		n.left.left = new Node(4);
		n.left.right = new Node(5);
		n.right.left = new Node (6);
		n.right.right = new Node (7);
		
		insertElement(n);
	}


	private static void insertElement(Node node) {
		Node myNode = new Node(100);

		if (node == null) {
			node = myNode;
		}

		Queue<Node> q = new LinkedList<>();
		q.add(node);

		while (!(q.isEmpty())) {
			Node n = q.poll();
			if (n.left == null) {
				n.left = myNode;
				break;
			} else {
				q.add(n.left);
			}

			if (n.right == null) {
				n.right = myNode;
				break;
			} else {
				q.add(n.right);
			}

		}
	}
}
