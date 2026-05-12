public class EnqueueOperation {
    int queue[] = new int[5];
    int front = -1;
    int rear = -1;
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
    public static void main(String[] args) {
        EnqueueOperation q = new EnqueueOperation();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
    }
}