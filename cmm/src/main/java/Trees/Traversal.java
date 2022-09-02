package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal {
	
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
		printPreorder(n);
		System.out.println();
		printInorder(n);
		System.out.println();
		printPostOrderr(n);
		System.out.println();
		System.out.println("iterator pre order");
		preOrderIterator(n);
		System.out.println();
		System.out.println("iterator In order");
		InOrderIterator(n);
		System.out.println();
		System.out.println("level In order");

		LevelOrderTraversal(n);
		reverseLevelOrderTraversal(n);

	}

	private static void reverseLevelOrderTraversal(Node n) {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(n);
		while (!(queue.isEmpty())) {
			Node temp = queue.poll();
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}

		}

	
	}

	private static void LevelOrderTraversal(Node n) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(n);
		while (!(queue.isEmpty())) {
			Node temp = queue.poll();
			System.out.print(" " + temp.data);

			if (temp.left != null) {
				queue.add(temp.left);
			}

			if (temp.right != null) {
				queue.add(temp.right);
			}

		}

	}

	private static void preOrderIterator(Node n) {
		if (n == null)
			return;

		Stack<Node> s = new Stack<Node>();
		s.push(n);
		while (!(s.isEmpty())) {
			Node m = s.pop();
			System.out.print(m.data + " ");

			if (m.right != null) {
				s.push(m.right);
			}
			if (m.left != null) {
				s.push(m.left);
			}

		}

	}
	
	private static void InOrderIterator(Node n) {
		if (n == null)
			return;

		Stack<Node> s = new Stack<Node>();
		Node curr = n;
		while (curr != null || s.size() > 0) {
			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.data + " ");

			curr = curr.right;
		}

	}

	static void printPreorder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
	 
	 static void printInorder(Node node)
	    {
	        if (node == null)
	            return;
	        printInorder(node.left);
	        System.out.print(node.data + " ");
	        printInorder(node.right);
	    }
	 
	 static void printPostOrderr(Node node)
	    {
	        if (node == null)
	            return;
	        printPostOrderr(node.left);
	        printPostOrderr(node.right);
	        System.out.print(node.data + " ");
	    }

}
