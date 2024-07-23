public class Main {
    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int total_sum = n * (n + 1) / 2;
        int array_sum = 0;
        for (int i : arr) {
            array_sum += i;
        }
        return total_sum - array_sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(findMissing(arr));  // Output: 3
    }
}
