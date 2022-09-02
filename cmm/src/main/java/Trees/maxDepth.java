package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class maxDepth {
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

		int k = maxDepth(n);
		System.out.println("line 46 {}" + k);

		int kk = maxDepthIterator(n);
		System.out.println("line 31 {}" + kk);

	}

	private static int maxDepthIterator(Node n) {
		int depth = 0;
		Queue<Node> q = new LinkedList<>();
		q.add(n);
		q.add(null);
		while (!(q.isEmpty())) {
			Node temp = q.peek();
			q.remove();

			if (temp == null)
				depth++;

			if (temp != null) {
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
			} else if (!q.isEmpty()) {
				q.add(null);
			}
		}
		return depth;
	}

	private static int maxDepth(Node n) {
		if(n == null)
			return -1;
		
		int ldepth = maxDepth(n.left);
		int rdepth = maxDepth(n.right);
		
		if(ldepth > rdepth)
			return ldepth+1;
		else
			return rdepth+1;
	}

}
