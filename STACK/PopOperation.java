public class PopOperation {
    int stack[] = {10, 20, 30, 40, 50};
    int top = 4;
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println(stack[top] + " removed from stack");
            top--;
        }
    }
    public static void main(String[] args) {
        PopOperation s = new PopOperation();
        s.pop();
    }
}