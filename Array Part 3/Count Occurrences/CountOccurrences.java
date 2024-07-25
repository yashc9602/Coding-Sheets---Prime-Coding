public class CountOccurrences {
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 3};
        int target = 3;
        System.out.println("Occurrences of " + target + ": " + countOccurrences(arr, target));  // Output: 3
    }
}
