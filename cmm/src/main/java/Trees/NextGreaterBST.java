package Trees;

import java.util.Stack;

import Trees.KthSmallestBST.Node;

public class NextGreaterBST {
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
		Node n = new Node(100);
		n.left = new Node(98);
		n.right = new Node(102);
		n.left.left = new Node(96);
		n.left.right = new Node(99);
		n.left.left.right = new Node(97);
		Stack<Integer> s = new Stack<Integer>();

		nextGreater(n,s);
		
		System.out.println(s.toString());
	}

	private static Stack nextGreater(Node n, Stack s) {
		if(n == null)
			return null;
		nextGreater(n.left, s);
		s.push(n.data);
		nextGreater(n.right, s);
		return s;
	}
	

}
