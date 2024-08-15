import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, left = 0;
        int bottom = rows - 1, right = cols - 1;
        int direction = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) { // left -> right
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            } else if (direction == 1) { // top -> bottom
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            } else if (direction == 2) { // right -> left
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            } else if (direction == 3) { // bottom -> top
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }

            direction = (direction + 1) % 4;
        }

        return result;
    }
}
