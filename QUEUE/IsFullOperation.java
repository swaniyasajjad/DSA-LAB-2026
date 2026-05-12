public class IsFullQueue {
    int queue[] = new int[5];
    int rear = 4;
    void isFull() {
        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
        }
        else {
            System.out.println("Queue is Not Full");
        }
    }
    public static void main(String[] args) {
        IsFullQueue q = new IsFullQueue();
        q.isFull();
    }
}