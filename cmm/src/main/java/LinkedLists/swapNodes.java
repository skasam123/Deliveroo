package LinkedLists;

public class swapNodes {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	Node head;
	
	public static void main(String[] args) {
		swapNodes lList = new swapNodes();
		lList.head = new Node(1);

		Node secNode = new  Node(4);
		lList.head.next = secNode;
		
		Node thrdNode = new  Node(5);
		lList.head.next.next = thrdNode;
		
		Node fourthNode = new  Node(8);

		lList.addInFront(fourthNode);
		Node fifthNode = new  Node(9);
		lList.addInEnd(fifthNode);
//		lList.printList(lList.head);
		
		lList.insertAtPosition(3);
		lList.printList(lList);
		
		System.out.println(" ");
		Node c = lList.swap(lList.head);
		lList.printevenoddList(c);

	}


	private void insertAtPosition(int pos) {
		Node midNode = new Node(0);
		Node current = head;
        Node previous = null;

        int i = 0;

        while (i < pos) {
            previous = current;
            current = current.next;
            i++;
        }

        midNode.next = current;
        previous.next = midNode;
	}
	

	private  void addInEnd(Node fifthNode) {
		Node n = head;
		while(n.next != null) {
			n = n.next;
		}
		n.next = fifthNode;
		
	}

	private  void addInFront(Node fourthNode) {
		fourthNode.next = head;
		head = fourthNode;
	}

	public  void printList(swapNodes list) {
		Node n = list.head;
		while (n != null) {
			if (n == head)
				System.out.print(n.data);
			else
				System.out.print("->" + n.data);

			n = n.next;
		}

	}
	
	public Node swap(Node list) {
		Node c = list;
		Node A = null;
		Node B = null;
		Node prevfrst = null;
		Node lastfrst = null;

		Node prev = null;

		while (list != null) {
			if (list.data == 8) {
				A = list;
				prevfrst = prev;
			}
			if (list.data == 4) {
				B = list;
				lastfrst = prev;
			}
			prev = list;
			list = list.next;
		}

		if (prevfrst == null) {
			Node temp1 = B.next;
			Node temp2 = A.next;
			A.next = temp1;
			lastfrst.next = A;
			B.next = temp2;
		}

		c = B;
		return c;

	}
	

	private void printevenoddList(Node n) {
		
		while (n != null) {
				System.out.print("->" + n.data);
			n = n.next;
		}
		
	}

}
