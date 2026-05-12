public class removeelement {
     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = arr.length;
        int removeElement = 4;
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == removeElement) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            for (int i = position; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--;
        }
        System.out.println("Final Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
