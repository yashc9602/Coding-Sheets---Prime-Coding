import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Integer, Integer> countOccurrences(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int elem : arr) {
            if (counts.containsKey(elem)) {
                counts.put(elem, counts.get(elem) + 1);
            } else {
                counts.put(elem, 1);
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 5};
        Map<Integer, Integer> result = countOccurrences(arr);
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Output:
        // 1: 1
        // 2: 2
        // 3: 1
        // 4: 2
        // 5: 3
    }
}
