public class traversalDLL {
    // Node class
    class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    // Insert at end (simple insertion for testing traversal)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    //  Print list forward
    public void printForward() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //  Print list backward
    public void printBackward() {
        if(head == null) return;
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Length of DLL
    public int length() {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Search for an element
    public boolean search(int key) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // Test traversal methods
    public static void main(String[] args) {
        traversalDLL dll = new traversalDLL();
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);

        System.out.println("Doubly Linked List Forward:");
        dll.printForward();

        System.out.println("Doubly Linked List Backward:");
        dll.printBackward();

        System.out.println("Length: " + dll.length());

        int key = 20;
        System.out.println("Searching for " + key + ": " + (dll.search(key) ? "Found" : "Not Found"));
    }
}