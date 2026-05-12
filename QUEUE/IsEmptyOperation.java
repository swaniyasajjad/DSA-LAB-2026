public class IsEmptyQueue {
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
    public static void main(String[] args) {
        IsEmptyQueue q = new IsEmptyQueue();
        q.isEmpty();
    }
}