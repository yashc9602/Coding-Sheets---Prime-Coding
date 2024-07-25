public class Main {
    public static int[] maxAndIndex(int[] arr) {
        int max_value = arr[0];
        int max_index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max_value) {
                max_value = arr[i];
                max_index = i;
            }
        }
        return new int[] { max_value, max_index };
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 9, 2};
        int[] result = maxAndIndex(arr);
        System.out.println("Max value: " + result[0] + ", Index: " + result[1]);  // Output: Max value: 9, Index: 3
    }
}
