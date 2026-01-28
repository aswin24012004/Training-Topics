package com.learn.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        System.out.println("=== Insert at Beginning ===");
        list.insertAtBeginning(4);
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.display();   // 1 -> 2 -> 3 -> 4 -> NULL

        System.out.println("\n=== Insert at End ===");
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.display();   // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL

        System.out.println("\n=== Insert at Position ===");
        list.insertAtPosition(10, 3);
        list.display();   // 1 -> 2 -> 10 -> 3 -> 4 -> 5 -> 6 -> NULL

        System.out.println("\n=== Delete from Beginning ===");
        list.deleteFromBeginning();
        list.display();   // 2 -> 10 -> 3 -> 4 -> 5 -> 6 -> NULL

        System.out.println("\n=== Delete from End ===");
        list.deleteFromEnd();
        list.display();   // 2 -> 10 -> 3 -> 4 -> 5 -> NULL

        System.out.println("\n=== Delete by Value (existing) ===");
        list.deleteByValue(10);
        list.display();   // 2 -> 3 -> 4 -> 5 -> NULL

        System.out.println("\n=== Delete by Value (not existing) ===");
        list.deleteByValue(100);   // Element not found
        list.display();

        System.out.println("\n=== Delete All Elements ===");
        list.deleteFromBeginning();
        list.deleteFromBeginning();
        list.deleteFromBeginning();
        list.deleteFromBeginning();
        list.display();   // List is empty

        System.out.println("\n=== Edge Case: Delete on E
