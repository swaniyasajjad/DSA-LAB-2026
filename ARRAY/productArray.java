public class productArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product = product * arr[j];
                }
            }
            result[i] = product;
        }
        System.out.println("New Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}