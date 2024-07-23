import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> removeDuplicates(int[] arr) {
        List<Integer> unique_elements = new ArrayList<>();
        for (int i : arr) {
            if (!unique_elements.contains(i)) {
                unique_elements.add(i);
            }
        }
        return unique_elements;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        List<Integer> result = removeDuplicates(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();  // Output: 1 2 3 4 5
    }
}
