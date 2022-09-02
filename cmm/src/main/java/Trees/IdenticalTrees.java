package Trees;

import Trees.MirrorTree.Node;

public class IdenticalTrees {

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
		
		
		Node m = new Node(1);
		m.left = new Node(2);
		m.right = new Node(3);
		m.left.left = new Node(4);
		m.left.right = new Node(9);
		m.right.left = new Node(6);
		m.right.right = new Node(7);

		System.out.println("line37{}" + MirrorTree(n,m));

	}

	private static boolean MirrorTree(Node n, Node m) {
		if (n == null && m == null) {
			return true;
		}
		if (n == null || m == null) { 
			return false;
		}
		if (n.data != m.data)
			return false;

		return (MirrorTree(n.left, m.left) && MirrorTree(n.right, m.right));

	}
}
