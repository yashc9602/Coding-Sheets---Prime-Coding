import java.util.*;

public class Solution {
    public String largestNumber(int[] nums) {
        List<String> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(String.valueOf(num));
        }
        Collections.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println("Largest Number: " + solution.largestNumber(nums));
    }
}
