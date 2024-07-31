import java.util.List;

public class Solution {
    public boolean isRectangleOverlap(List<Integer> rec1, List<Integer> rec2) {
        int x1 = rec1.get(0), y1 = rec1.get(1), x2 = rec1.get(2), y2 = rec1.get(3);
        int x3 = rec2.get(0), y3 = rec2.get(1), x4 = rec2.get(2), y4 = rec2.get(3);
        return (x1 < x4 && x3 < x2 && y1 < y4 && y3 < y2);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> rec1 = List.of(0, 0, 2, 2);
        List<Integer> rec2 = List.of(1, 1, 3, 3);
        boolean result = sol.isRectangleOverlap(rec1, rec2);
        System.out.println(result); // Output: true
    }
}
