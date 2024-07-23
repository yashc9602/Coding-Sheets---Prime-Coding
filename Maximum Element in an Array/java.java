public class Main {
    public static int findMax(int[] arr) {
        int max_elem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max_elem) {
                max_elem = arr[i];
            }
        }
        return max_elem;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4};
        System.out.println(findMax(arr));  // Output: 5
    }
}
