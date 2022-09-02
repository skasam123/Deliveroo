package LinkedLists;

public class loopList {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	Node head;
	
	static Node loopNode;
	public static void main(String[] args) {
		loopList lList = new loopList();
		lList.head = new Node(1);

		Node secNode = new  Node(4);
		lList.head.next = secNode;
		
		Node thrdNode = new  Node(5);
		lList.head.next.next = thrdNode;
		
		loopNode = new  Node(8);
//		loopNode = fourthNode;
//		loopNode.next = null;
		
		lList.addInFront(loopNode);
		
		Node fifthNode = new  Node(9);
//		lList.addInEnd(fifthNode);
		
		Node sixthNode = new  Node(6);
//		lList.addInEnd(sixthNode);
		
		
		lList.insertAtPosition(3);
		lList.printList(lList);
		
		System.out.println(" ");
		lList.detectLoop(lList);
		

	}


	private void detectLoop(loopList lList ) {
		Node fast = head;
        Node slow = head;
        while( fast != slow)
        {
            if( fast==null || fast.next==null) 
            	System.out.println("Not a loop");            
            
            fast=fast.next.next;
            slow=slow.next;
        }
    	System.out.println("Its  a loop");            

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
	
	private  void addInFront(Node fourthNode) {
		fourthNode.next = head;
		head = fourthNode;
	}

	public void printList(loopList list) {
		Node n = list.head;
		while (n != null) {
			if (n == head)
				System.out.print(n.data);
			else
				System.out.print("->" + n.data);

			n = n.next;
		}

	}
	

	private void printevenoddList(Node n) {

		while (n != null) {
			System.out.print("->" + n.data);
			n = n.next;
		}

	}

}
