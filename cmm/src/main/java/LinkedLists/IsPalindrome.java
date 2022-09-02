package LinkedLists;

import java.util.Stack;

import LinkedLists.SingleLinkedList.Node;

public class IsPalindrome {
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	Node head;
	
	
	public static void main(String[] args) {
		
		IsPalindrome lList = new IsPalindrome();
		lList.head = new Node(3);
		
		Node secNode = new  Node(4);
		lList.head.next = secNode;
		
		Node thrdNode = new  Node(4);
		lList.head.next.next = thrdNode;
		
		Node fourthNode = new  Node(3);
		lList.head.next.next.next = fourthNode;
		
		lList.IsPalindromeList(lList.head);
		
	}
	
	void IsPalindromeList(Node head){
		Node h = head;
		Node h1 = head;
		Stack<Integer> stack = new Stack<Integer>();
		while(h.next != null) {
			stack.push(h.data);
			System.out.println("Pushed:{}" + h.data);
			h = h.next;
			
		}
		stack.push(h.data);
		System.out.println("Pushed:{} " + h.data);
		
		int itr = stack.size();
		boolean s = true;
		for(int i = 0 ; i <= itr/2 ; i++) {
			if(h1.data == stack.pop()) {
				h1 = h1.next;
			}else {
				s = false;
				break;
			}
		}
		
		if(s) {
			System.out.println("Its a palindrome");
		}
		
		
	}
	
}
