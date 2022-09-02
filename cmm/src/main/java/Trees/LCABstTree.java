package Trees;

import Trees.KthSmallestBST.Node;

public class LCABstTree {
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
		Node n = new Node(20);
		n.left = new Node(8);
		n.right = new Node(22);
		n.left.left = new Node(4);
		n.left.right = new Node(12);
		n.left.right.left = new Node(10);
		n.left.right.right = new Node(14);
		
		lcaTree(n);
	}

	private static void lcaTree(Node n) {
		int n1 = 10;
		int n2 = 14;
		int data = 0;
		while (n != null)	{
			data = n.data;
			if (n1 < n.data && n2 < n.data) {
				n = n.left;
			} else if (n1 > n.data && n2 > n.data) {
				n = n.right;
			} else
				break;
		}
		System.out.println("line43{}" + data);

	}


}
