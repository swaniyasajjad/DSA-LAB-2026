public class DisplayQueue {
    int queue[] = {10, 20, 30, 40};
    int front = 0;
    int rear = 3;
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
        DisplayQueue q = new DisplayQueue();
        q.display();
    }
}