package LinkedLists;

public class evenOddList {

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
		evenOddList lList = new evenOddList();
		lList.head = new Node(1);

		Node secNode = new  Node(3);
		lList.head.next = secNode;
		
		Node thrdNode = new  Node(5);
		lList.head.next.next = thrdNode;
		
		Node fourthNode = new  Node(7);

		lList.addInFront(fourthNode);
		Node fifthNode = new  Node(9);
		lList.addInEnd(fifthNode);
//		lList.printList(lList.head);
		
		lList.insertAtPosition(3);
		lList.printList(lList);
		
		System.out.println(" ");
		Node c = lList.evenOddLists(lList.head);
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

	public  void printList(evenOddList list) {
		Node n = list.head;
		while (n != null) {
			if (n == head)
				System.out.print(n.data);
			else
				System.out.print("->" + n.data);

			n = n.next;
		}

	}
	
	public Node evenOddLists(Node list) {
		Node evenHead = null;
		Node even = null;
		Node oddHead = null;
		Node odd = null;

		while (list != null) {
			if (list.data % 2 == 0) {
				if (evenHead == null) {
					evenHead = list;
					even = list;
				} else {
					even.next = list;
					even = even.next;
				}
			} else {
				if (oddHead == null) {
					oddHead = list;
					odd = list;
				} else {
					odd.next = list;
					odd = odd.next;
				}
			}
			list = list.next;
		}
		if(odd != null) {
			odd.next = null;
		}
		if(even != null) {
			even.next = oddHead;
		}

		return evenHead;
	}

	private void printevenoddList(Node n) {
		
		while (n != null) {
				System.out.print("->" + n.data);
			n = n.next;
		}
		
	}

}
