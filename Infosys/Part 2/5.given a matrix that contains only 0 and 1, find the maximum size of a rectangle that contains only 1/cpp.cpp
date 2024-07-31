#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int maximalRectangle(vector<vector<char>>& matrix) {
        if(matrix.empty()) return 0;
        int ans = 0, m = matrix.size(), n = matrix[0].size();
        for(int start_i = 0; start_i < m; start_i++) {
            for(int start_j = 0; start_j < n; start_j++) {
                for(int end_i = start_i; end_i < m; end_i++) {
                    for(int end_j = start_j; end_j < n; end_j++) {
                        bool allOnes = true;
                        for(int i = start_i; i <= end_i && allOnes; i++) {
                            for(int j = start_j; j <= end_j && allOnes; j++) {
                                if(matrix[i][j] != '1') allOnes = false;
                            }
                        }
                        if(allOnes) {
                            ans = max(ans, (end_i - start_i + 1) * (end_j - start_j + 1));
                        }
                    }
                }
            }
        }
        return ans;
    }
};

// Example usage:
int main() {
    Solution sol;
    vector<vector<char>> matrix = {
        {'1', '0', '1', '0', '0'},
        {'1', '0', '1', '1', '1'},
        {'1', '1', '1', '1', '1'},
        {'1', '0', '0', '1', '0'}
    };
    int result = sol.maximalRectangle(matrix);
    // Output: 6
    return 0;
}
