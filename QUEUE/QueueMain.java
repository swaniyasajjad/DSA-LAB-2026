import java.util.Scanner;
public class QueueMain {
    int queue[] = new int[5];
    int front = -1;
    int rear = -1;
    void isEmpty() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println("Queue is Not Empty");
        }
    }
    void isFull() {
        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
        }
        else {
            System.out.println("Queue is Not Full");
        }
    }
    void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        }
        else {
            System.out.println(queue[front] + " removed from queue");
            front++;
        }
    }
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println("Queue Elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueMain q = new QueueMain();
        int choice, value;
        do {
            System.out.println("\n===== QUEUE MENU =====");
            System.out.println("1. isEmpty");
            System.out.println("2. isFull");
            System.out.println("3. Enqueue");
            System.out.println("4. Dequeue");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    q.isEmpty();
                    break;
                case 2:
                    q.isFull();
                    break;
                case 3:
                    System.out.print("Enter Value: ");
                    value = sc.nextInt();
                    q.enqueue(value);
                    break;
                case 4:
                    q.dequeue();
                    break;
                case 5:
                    q.display();
                    break;
                case 6:
                    System.out.println("Program Ended");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 6);
        sc.close();
    }
}