public class DisplayOperation {
    int stack[] = {10, 20, 30, 40};
    int top = 3;
    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {
        DisplayOperation s = new DisplayOperation();
        s.display();
    }
}