// Write a program that accepts the integer array of length ‘size’ and finds the largest number that can be formed by permutation.

public class Main {

    public static boolean compare(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        return ab.compareTo(ba) > 0;
    }

    public static void custom_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (!compare(arr[i], arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static String largest_number(int[] arr) {
        custom_sort(arr);
        StringBuilder result = new StringBuilder();
        for (int num : arr) {
            result.append(num);
        }
        return result.charAt(0) == '0' ? "0" : result.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println("The largest number formed is " + largest_number(arr));  // Output should be 9534330
    }
}
