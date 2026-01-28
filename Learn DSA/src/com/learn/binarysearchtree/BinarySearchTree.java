package com.learn.binarysearchtree;


public class BinarySearchTree {
	Node root;
	class Node{
		int data;
		Node right, left;
		
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	public BinarySearchTree(int data) {
		root = new Node(data);
	}
	
	
	public void insert(int data) {
		insert(root,data);
	}
	public Node insert(Node root, int data) {
		if(root == null) {
			return new Node(data);
		}
		if(data < root.data) {
			root.left = insert(root.left, data);
		}
		else {
			root.right = insert(root.right, data);
		}
		return root;
	}
	
	public void displayInorder(Node root) {
		if(root != null) {
			displayInorder(root.left);
			System.out.print(root.data+" ");
			displayInorder(root.right);
		}
	}


	public Node search(Node root, int data) {
		if(root == null || root.data == data) {
			return root;
		}
		if(data < root.data) {
			return search(root.left, data);
		}
		else {
			return search(root.right, data);
		}
		
//		return root;
	}
}

