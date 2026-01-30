package com.learn.tree;

public class BinaryTree {
	Node root;
	class Node{
		char data;
		Node right, left;
		
		public Node(char data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public BinaryTree(char data) {
		root = new Node(data);
	}
	
	public void insertAtLeft(Node parent, char data) {
		parent.left = new Node(data);
	}
	
	public void insertAtRight(Node parent, char data) {
//		Node newNode = new Node(data);
//		root.right = newNode;
		parent.right = new Node(data);
	}
	
	public void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	public void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
}
