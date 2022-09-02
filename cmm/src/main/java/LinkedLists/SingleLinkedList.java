package LinkedLists;

public class SingleLinkedList {

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
		SingleLinkedList lList = new SingleLinkedList();
		lList.head = new Node(1);

		Node secNode = new  Node(3);
		lList.head.next = secNode;
		
		Node thrdNode = new  Node(5);
		lList.head.next.next = thrdNode;
		
		Node fourthNode = new  Node(7);

		lList.addInFront(fourthNode);
		Node fifthNode = new  Node(9);
		lList.addInEnd(fifthNode);
////		lList.printList(lList.head);
		
		lList.insertAtPosition(3);
//		lList.printList(lList);
		
		System.out.println(" ");
//		lList.evenOddList(lList.head);
//		lList.printList(lList);

		
		

//		Node n = lList.reverseList(lList);
//		lList.printList(n);
		
		
		
//	int n = lList.middleNode(lList.head);
//	System.out.println("line48" + n);
		System.out.println();
	
	SingleLinkedList lList2 = new SingleLinkedList();
	lList2.head = new Node(1);

	Node secNode2 = new  Node(1);
	lList2.head.next = secNode2;
	
	Node thrdNode3 = new  Node(5);
	lList2.head.next.next = thrdNode3;
	
	
	Node fifthNode2 = new  Node(9);
	lList2.addInEnd(fifthNode2);
	
	Node fifthNode34 = new  Node(10);
	lList2.addInEnd(fifthNode34);
	
	lList2.printList(lList2);
	
	SingleLinkedList lList3 = new SingleLinkedList();
	
	lList3.head = new Node(1);

	Node secNode3 = new  Node(4);
	lList3.head.next = secNode3;
	
	Node thrdNode4 = new  Node(6);
	lList3.head.next.next = thrdNode4;
	
	
	Node fifthNode3 = new  Node(8);
	lList3.addInEnd(fifthNode3);
	
	System.out.println();
//	lList3.printList(lList3);

//	mergeSortedlist(lList2.head, lList3.head);
	
	Node n = removeDuplicates(lList2.head);
	lList2.printList(n);

		
	}

	private static Node removeDuplicates(Node head2) {
		Node head = null;
		Node ans = null;
		

		
		while(head2!= null && head2.next != null) {
			if(head2.data == head2.next.data) {
				head2 = head2.next.next;
				continue;
			}else {
				if(head == null) {
				 head = head2;
				 ans = head;
				}
				else {
				 head.next = head2;
				 head = head.next;
				}
				head2  = head2.next;
			}
		}
		head.next = null;
		System.out.println(ans);
		return ans;

	}

	private int middleNode(Node head2) {
		Node fptr = head;
		Node sptr = head.next;
		boolean even = false;
		if(fptr == null) {
			return -1;
		}
		if(fptr.next == null) {
			return fptr.data;
		}
		if(fptr.next.next == null) {
			return fptr.next.data;
		}
		while(sptr!= null && sptr.next != null ) {
			 even = false;
			if(sptr.next.next != null) {
				sptr = sptr.next.next;
				 even = true;
				fptr = fptr.next;
			}else if(fptr != null) {
				sptr = sptr.next;
				fptr = fptr.next;
			}
		}
		if(even) {
			fptr = fptr.next;
		}
		return  fptr.data;
		
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
	

	private Node reverseList(SingleLinkedList lList) {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current.next != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		next.next = prev;
		return next;
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

	public  void printList(SingleLinkedList list) {
		Node n = list.head;
		while (n != null) {
			if (n == head)
				System.out.print(n.data);
			else
				System.out.print("->" + n.data);

			n = n.next;
		}

	}
	
	public  void printList(Node head) {
		Node n = head;
		while (n != null) {
			if (n == head)
				System.out.print(n.data);
			else
				System.out.print("->" + n.data);

			n = n.next;
		}

	}
	
	public Node evenOddList(Node list) {
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
					odd = list;
					oddHead = odd;
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

		return even;
	}
	
	

}
