public class DequeueOperation {
    int queue[] = {10, 20, 30, 40, 50};
    int front = 0;
    int rear = 4;
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        }
        else {
            System.out.println(queue[front] + " removed from queue");
            front++;
        }
    }
    public static void main(String[] args) {
        DequeueOperation q = new DequeueOperation();
        q.dequeue();
    }
}