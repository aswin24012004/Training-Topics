package com.learn.tree;

public class Main {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree('a');
		tree.insertAtLeft(tree.root, 'b');
        tree.insertAtRight(tree.root, 'c');

        tree.insertAtLeft(tree.root.left, 'd');
        tree.insertAtRight(tree.root.left, 'f');

        tree.insertAtLeft(tree.root.right, 'e');
        tree.insertAtRight(tree.root.right, 'g');
		
        System.out.print("Pre Oreder Traversal : ");
		tree.preOrder(tree.root);
		System.out.println();
		
		System.out.print("In Oreder Traversal : ");
		tree.inOrder(tree.root);
		System.out.println();
		
		System.out.print("Post Oreder Traversal : ");
		tree.postOrder(tree.root);
		System.out.println();

	}

}
