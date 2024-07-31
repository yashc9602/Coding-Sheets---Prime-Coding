import java.util.List;
import java.util.ArrayList;

public class Solution {
    public int maximalRectangle(List<List<Character>> matrix) {
        if (matrix.isEmpty()) return 0;
        int ans = 0, m = matrix.size(), n = matrix.get(0).size();
        for (int start_i = 0; start_i < m; start_i++) {
            for (int start_j = 0; start_j < n; start_j++) {
                for (int end_i = start_i; end_i < m; end_i++) {
                    for (int end_j = start_j; end_j < n; end_j++) {
                        boolean allOnes = true;
                        for (int i = start_i; i <= end_i && allOnes; i++) {
                            for (int j = start_j; j <= end_j && allOnes; j++) {
                                if (matrix.get(i).get(j) != '1') allOnes = false;
                            }
                        }
                        if (allOnes) {
                            ans = Math.max(ans, (end_i - start_i + 1) * (end_j - start_j + 1));
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<List<Character>> matrix = new ArrayList<>();
        matrix.add(List.of('1', '0', '1', '0', '0'));
        matrix.add(List.of('1', '0', '1', '1', '1'));
        matrix.add(List.of('1', '1', '1', '1', '1'));
        matrix.add(List.of('1', '0', '0', '1', '0'));
        int result = sol.maximalRectangle(matrix);
        System.out.println(result); // Output: 6
    }
}
