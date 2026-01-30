package com.learn.binarysearchtree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(50);
		bst.insert(10);
		bst.insert(20);
		bst.insert(30);
		bst.insert(60);
		bst.insert(70);
		bst.insert(80);
		
		bst.displayInorder(bst.root);
		System.out.println();
		
		if(bst.search(bst.root,70) == null) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Found");
		}
	}

}
