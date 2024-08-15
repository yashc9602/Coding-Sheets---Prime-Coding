#include <vector>

class Solution {
public:
    std::vector<int> spiralOrder(std::vector<std::vector<int>>& matrix) {
        if (matrix.empty() || matrix[0].empty()) {
            return {};
        }

        int rows = matrix.size();
        int cols = matrix[0].size();
        std::vector<int> result;

        int top = 0, left = 0;
        int bottom = rows - 1, right = cols - 1;
        int direction = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) { // left -> right
                for (int i = left; i <= right; ++i) {
                    result.push_back(matrix[top][i]);
                }
                ++top;
            } else if (direction == 1) { // top -> bottom
                for (int i = top; i <= bottom; ++i) {
                    result.push_back(matrix[i][right]);
                }
                --right;
            } else if (direction == 2) { // right -> left
                for (int i = right; i >= left; --i) {
                    result.push_back(matrix[bottom][i]);
                }
                --bottom;
            } else if (direction == 3) { // bottom -> top
                for (int i = bottom; i >= top; --i) {
                    result.push_back(matrix[i][left]);
                }
                ++left;
            }

            direction = (direction + 1) % 4;
        }

        return result;
    }
};
