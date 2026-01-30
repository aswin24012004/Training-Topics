# Binary Search Tree (BST) Implementation in Java

This project demonstrates a **Binary Search Tree (BST)** implementation using **Java**, including core operations such as **insertion**, **inorder traversal**, and **searching**.

---

## 📌 Features
- Create a Binary Search Tree
- Insert nodes following BST rules
- Display elements using **Inorder Traversal**
- Search for a value in the tree using recursion

---

## 📂 Project Structure

com.learn.binarysearchtree
│
├── BinarySearchTree.java // BST implementation
└── Main.java // Driver class


---

## 🌳 Binary Search Tree Rules
- Left subtree contains values **less than** the root
- Right subtree contains values **greater than** the root
- Inorder traversal of BST gives **sorted output**

---

## 🧩 BinarySearchTree Class

### Node Structure
Each node contains:
- `data` → value stored
- `left` → reference to left child
- `right` → reference to right child

---

## 🔧 Operations Implemented

### 1. Insert
Adds a new value while maintaining BST properties.

```java
bst.insert(10);
bst.insert(20);

2. Inorder Traversal

Prints tree elements in ascending order.

bst.displayInorder(bst.root);


Output:

10 20 30 50 60 70 80

3. Search

Searches for a value recursively.

bst.search(bst.root, 70);


Result:

Found

▶️ Main Class Execution
BinarySearchTree bst = new BinarySearchTree(50);
bst.insert(10);
bst.insert(20);
bst.insert(30);
bst.insert(60);
bst.insert(70);
bst.insert(80);

bst.displayInorder(bst.root);

if (bst.search(bst.root, 70) == null) {
    System.out.println("Not found");
} else {
    System.out.println("Found");
}

🖥️ Sample Output
10 20 30 50 60 70 80
Found