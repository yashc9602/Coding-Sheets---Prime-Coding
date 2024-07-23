public class Main {
    public static int kthLargest(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int max_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max_index]) {
                    max_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp;
        }
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(kthLargest(arr, k));  // Output: 5
    }
}
