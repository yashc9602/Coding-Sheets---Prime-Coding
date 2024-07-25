import java.util.HashMap;

public class FindPairWithSum {
    public static int[] findPairWithSum(int[] array, int target_sum) {
        HashMap<Integer, Boolean> seenNumbers = new HashMap<>();
        for (int number : array) {
            int complement = target_sum - number;
            if (seenNumbers.containsKey(complement)) {
                return new int[] {complement, number};
            }
            seenNumbers.put(number, true);
        }
        return null; // Return null if no pair found
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6};
        int target_sum = 8;
        int[] result = findPairWithSum(array, target_sum);
        if (result != null) {
            System.out.println("Pair found: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("No pair found");
        }
    }
}
