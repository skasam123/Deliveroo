package Trees;

import java.util.ArrayList;

import Trees.maxDepth.Node;

public class KthSmallestBST {
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
		Node n = new Node(2);
		n.left = new Node(1);
		n.right = new Node(3);
		n.left.left = new Node(-1);
		n.left.right = new Node(-1);
		n.left.left.left = new Node(-1);
		n.left.right.right = new Node(-1);
		
		kThSmallest(n);
	}

	private static int kThSmallest(Node n) {
		if(n == null)
			return 0;
		if(n.left == null)
			return n.data;
		ArrayList<Integer> al = new ArrayList<>();
		
		while(n != null ) {
			al.add(n.data);
			n = n.left;
		}
		
		for(int k : al) {
			System.out.println("line45{}" + k);
		}
		System.out.println("line37{}" + al.get(1));
		return al.get(1);
		
	}
}
