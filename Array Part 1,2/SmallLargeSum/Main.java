import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int SmallLargeSum(int[] array) {
        if (array.length <= 3) {
            return 0;
        }

        List<Integer> even_elements = new ArrayList<>();
        List<Integer> odd_elements = new ArrayList<>();

        // Separate elements based on their positions
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                even_elements.add(array[i]);
            } else {
                odd_elements.add(array[i]);
            }
        }

        // Find second largest in even_elements
        if (even_elements.size() < 2) {
            return 0;
        }
        int max1_even = Integer.MIN_VALUE;
        int max2_even = Integer.MIN_VALUE;
        for (int num : even_elements) {
            if (num > max1_even) {
                max2_even = max1_even;
                max1_even = num;
            } else if (num > max2_even) {
                max2_even = num;
            }
        }

        // Find second largest in odd_elements
        if (odd_elements.size() < 2) {
            return 0;
        }
        int max1_odd = Integer.MIN_VALUE;
        int max2_odd = Integer.MIN_VALUE;
        for (int num : odd_elements) {
            if (num > max1_odd) {
                max2_odd = max1_odd;
                max1_odd = num;
            } else if (num > max2_odd) {
                max2_odd = num;
            }
        }

        return max2_even + max2_odd;
    }

    // Sample test cases
    public static void main(String[] args) {
        int[] array1 = {3, 2, 1, 7, 5, 4};
        System.out.println(SmallLargeSum(array1));  // Output: 7

        int[] array2 = {4, 0, 7, 9, 6, 4, 2};
        System.out.println(SmallLargeSum(array2));  // Output: 10
    }
}
