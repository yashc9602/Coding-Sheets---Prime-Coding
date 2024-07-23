import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        for (int num1 : arr1) {
            boolean found = false;
            for (int num2 : arr2) {
                if (num1 == num2) {
                    found = true;
                    break;
                }
            }
            if (found && !result.contains(num1)) {
                result.add(num1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};
        List<Integer> result = intersection(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();  // Output: 2 3
    }
}
