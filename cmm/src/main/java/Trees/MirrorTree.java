package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {

	
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

		MirrorTree(n);

	}

	private static void MirrorTree(Node n) {
		if(n == null)
			System.out.println("its a null tree");
		
		if(n.left == null && n.right == null)
			System.out.println("its a single root tree");
		
		Queue<Node> q = new LinkedList<>();
		q.add(n);
		
		while (!(q.isEmpty())) {
			Node curr = q.poll();
			Node temp = curr.left;
			curr.left = curr.right;
			curr.right = temp;
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);
		}
		System.out.println(""+ q.peek());
		
	}

}
