# 🔗 Singly Linked List – Java Implementation

This module contains a **Singly Linked List implementation in Java**, covering all fundamental operations such as **insertion, deletion, and traversal**.  
The goal is to understand **dynamic memory structures**, pointer manipulation, and **time–space complexity**.

---

## 🧱 Node Structure

Each node contains:
- `data` → value stored in the node
- `next` → reference to the next node

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
⚙️ Operations Implemented
✅ Insert Operations
Insert at Beginning

Insert at End

Insert at Given Position

❌ Delete Operations
Delete from Beginning

Delete from End

Delete by Value

🔍 Traversal
Display Linked List

📌 Insert Methods
Insert at Beginning
public void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}
Insert at End
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
Insert at Given Position (1-based)
public void insertAtPosition(int data, int position) {
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
        System.out.println("Invalid position");
        return;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}
🗑 Delete Methods
Delete from Beginning
public void deleteFromBeginning() {
    if (head == null) return;
    head = head.next;
}
Delete from End
public void deleteFromEnd() {
    if (head == null || head.next == null) {
        head = null;
        return;
    }

    Node temp = head;
    while (temp.next.next != null) {
        temp = temp.next;
    }
    temp.next = null;
}
Delete by Value
public void deleteByValue(int data) {
    if (head == null) return;

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
📤 Display Method
public void display() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("NULL");
}
Sample Output
10 -> 20 -> 30 -> NULL
⏱ Time & Space Complexity
Operation	Time Complexity	Space Complexity
Insert at Beginning	O(1)	O(1)
Insert at End	O(n)	O(1)
Insert at Position	O(n)	O(1)
Delete at Beginning	O(1)	O(1)
Delete at End	O(n)	O(1)
Delete by Value	O(n)	O(1)
Display	O(n)	O(1)
🎯 Key Learning Outcomes
Understanding dynamic data structures

Efficient pointer manipulation

Handling edge cases

Evaluating time and space complexity

👨‍💻 Author
Aswin C
GitHub: aswin24012004