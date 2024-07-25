public class FindMinAndIndex {
    public static int[] findMinAndIndex(int[] arr) {
        if (arr.length == 0) {
            return new int[]{Integer.MAX_VALUE, -1};  // Return max value and -1 if the array is empty
        }

        int minValue = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        return new int[]{minValue, minIndex};
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2};
        int[] result = findMinAndIndex(arr);
        System.out.println("Minimum value: " + result[0] + ", Index: " + result[1]);
        // Output: Minimum value: 1, Index: 1
    }
}
