public class deletionDLL {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Insert at end (for testing)
    void insert(int data) {

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

    // Display list
    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    //  Delete from beginning
    void deleteBeginning() {

        if (head == null) {
            System.out.println("List empty");
            return;
        }

        head = head.next;

        if (head != null)
            head.prev = null;
    }

    //  Delete from end
    void deleteEnd() {

        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    //  Delete by position
    void deletePosition(int position) {

        if (head == null) return;

        Node temp = head;

        if (position == 1) {
            deleteBeginning();
            return;
        }

        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    //  Delete by value
    void deleteValue(int value) {

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        if (temp == head) {
            deleteBeginning();
            return;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    //  Delete entire list
    void deleteEntireList() {

        head = null;

        System.out.println("Doubly Linked List Deleted");
        System.out.println("Name : SYEDA WANIYA SAJJAD");
        System.out.println("Seat Number : EB25210006106");
    }
}
