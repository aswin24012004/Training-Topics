# 🌳 Binary Tree – Java Implementation

This repository contains a **Binary Tree implementation in Java**, demonstrating **core tree concepts**, **node insertion**, and **tree traversals**.  

It is part of my structured practice for **Data Structures and Algorithms (DSA)** and **Java programming interviews**.

---

## 🧱 Node Structure

Each node in the binary tree contains:

- `data` → value stored in the node  
- `left` → reference to the left child node  
- `right` → reference to the right child node  

```java
class Node {
    char data;
    Node left, right;

    Node(char data) {
        this.data = data;
        left = null;
        right = null;
    }
}

⚙️ Operations Implemented
✅ Insert Methods

insertAtLeft(Node parent, char data) → Adds a node as the left child of a given parent

insertAtRight(Node parent, char data) → Adds a node as the right child of a given parent

🔄 Traversals

Preorder Traversal → Root → Left → Right

Inorder Traversal → Left → Root → Right

Postorder Traversal → Left → Right → Root

🌳 Sample Tree
Structure
        a
      /   \
     b     c
    / \   / \
   d   f e   g

Example Code
BinaryTree tree = new BinaryTree('a');

// Level 1
tree.insertAtLeft(tree.root, 'b');
tree.insertAtRight(tree.root, 'c');

// Level 2
tree.insertAtLeft(tree.root.left, 'd');
tree.insertAtRight(tree.root.left, 'f');
tree.insertAtLeft(tree.root.right, 'e');
tree.insertAtRight(tree.root.right, 'g');

Traversal Outputs

Preorder: a b d f c e g

Inorder: d b f a e c g

Postorder: d f b e g c a

⏱ Complexity Analysis
Operation	Time Complexity	Space Complexity
Insert	O(1)	O(1)
Preorder Traversal	O(n)	O(h)
Inorder Traversal	O(n)	O(h)
Postorder Traversal	O(n)	O(h)

n = number of nodes

h = height of the tree (stack space used by recursion)

🛠 Tools & Technologies

Language: Java

IDE: Eclipse / IntelliJ IDEA

Version Control: Git & GitHub

📂 Project Structure
Trees/
 ├── BinaryTree.java
 ├── Main.java
 └── README.md

🎯 Learning Outcomes

Understand binary tree structure and nodes

Implement tree insertion at left and right

Apply preorder, inorder, and postorder traversal

Evaluate time and space complexity for tree operations

🔮 Future Enhancements

Binary Search Tree (BST) implementation

Level Order / Breadth-First Traversal

Iterative tree traversals

Height, size, leaf count methods

Tree algorithms (e.g., diameter, lowest common ancestor)

👨‍💻 Author

Aswin C
GitHub: aswin24012004