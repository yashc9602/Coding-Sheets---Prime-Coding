import java.util.Arrays;

public class RotateArray {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  // In case d is greater than n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotateArray(arr, d);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
