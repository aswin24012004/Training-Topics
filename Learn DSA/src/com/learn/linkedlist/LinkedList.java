package com.lean.linkedlist;



public class LinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public LinkedList() {
		head = null;
	}
	
	public void display() {
	    Node temp = head;
	    while (temp != null) {
	        System.out.print(temp.data + " -> ");
	        temp = temp.next;
	    }
	    System.out.println("null");
	}

	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void insertAtEnd(int data) {
	    Node newNode = new Node(data);

	    if (head == null) {
	        head = newNode;
	        return;
	    }

	    Node temp = head;
	    while (temp.next != null) {
	        temp = temp.next;
	    }
	    temp.next = newNode;
	}
	public void insertAtPosition(int data, int position) {
	    if (position <= 0) {
	        System.out.println("Invalid position");
	        return;
	    }

	    if (position == 1) {
	        insertAtBeginning(data);
	        return;
	    }

	    Node newNode = new Node(data);
	    Node temp = head;

	    for (int i = 1; i < position - 1 && temp != null; i++) {
	        temp = temp.next;
	    }

	    if (temp == null) {
	        System.out.println("Position out of range");
	        return;
	    }

	    newNode.next = temp.next;
	    temp.next = newNode;
	}
	
	
	
	public void deleteFromBeginning() {
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }
	    head = head.next;
	}
	
	
	public void deleteFromEnd() {
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    if (head.next == null) {
	        head = null;
	        return;
	    }

	    Node temp = head;
	    while (temp.next.next != null) {
	        temp = temp.next;
	    }
	    temp.next = null;
	}

	public void deleteByValue(int data) {
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    if (head.data == data) {
	        head = head.next;
	        return;
	    }

	    Node temp = head;
	    while (temp.next != null && temp.next.data != data) {
	        temp = temp.next;
	    }

	    if (temp.next == null) {
	        System.out.println("Element not found");
	        return;
	    }

	    temp.next = temp.next.next;
	}


}
