public class insertionDLL {
    // Node class
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at end
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
        newNode.prev = temp;
    }

    // Insert at specific position (1-based)
    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    // Insert after a given node (by value)
    public void insertAfterValue(int target, int data) {
        Node temp = head;
        while (temp != null && temp.data != target) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Target not found");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    // Insert before a given node (by value)
    public void insertBeforeValue(int target, int data) {
        Node temp = head;
        while (temp != null && temp.data != target) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Target not found");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp;
        newNode.prev = temp.prev;
        if (temp.prev != null) {
            temp.prev.next = newNode;
        } else {
            head = newNode; // updating head if first node
        }
        temp.prev = newNode;
    }

    // Display the list forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display the list backward
    public void displayBackward() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}