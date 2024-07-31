import java.util.List;
import java.util.ArrayList;

public class Solution {
    public int triangularSum(List<Integer> nums) {
        int n = nums.size();
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                nums.set(j, (nums.get(j) + nums.get(j + 1)) % 10);
            }
        }
        return nums.get(0);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        int result = sol.triangularSum(nums);
        System.out.println(result); // Output: 8
    }
}
