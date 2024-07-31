import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, int[]> m = new HashMap<>();
        int idx = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            m.put(c, new int[]{m.getOrDefault(c, new int[]{0, 0})[0] + 1, i});
        }
        for (Map.Entry<Character, int[]> entry : m.entrySet()) {
            if (entry.getValue()[0] == 1) {
                idx = Math.min(idx, entry.getValue()[1]);
            }
        }
        return idx == s.length() ? -1 : idx;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "leetcode";
        int result = sol.firstUniqChar(s);
        System.out.println(result);  // Output: 0
    }
}
