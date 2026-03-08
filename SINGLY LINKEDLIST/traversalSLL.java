public class traversalSLL {
    // Node class
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
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
    }

    //  Print linked list
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //  Length of linked list
    public int length() {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Search for an element (returns true if found)
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
        
        traversalSLL sll = new traversalSLL();
        sll.insertAtEnd(10);
        sll.insertAtEnd(20);
        sll.insertAtEnd(30);

        System.out.println("Singly Linked List:");
        sll.printList();

        System.out.println("Length: " + sll.length());

        int key = 20;
        System.out.println("Searching for " + key + ": " + (sll.search(key) ? "Found" : "Not Found"));
        System.out.println("Name: SYEDA WANIYA SAJJAD");
        System.out.println("Seat Number: EB25210006106");

    }
}

