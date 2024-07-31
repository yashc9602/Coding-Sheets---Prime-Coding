#include <vector>
using namespace std;

class Solution {
public:
    bool isRectangleOverlap(vector<int>& rec1, vector<int>& rec2) {
        int x1 = rec1[0], y1 = rec1[1], x2 = rec1[2], y2 = rec1[3];
        int x3 = rec2[0], y3 = rec2[1], x4 = rec2[2], y4 = rec2[3];
        return (x1 < x4 && x3 < x2 && y1 < y4 && y3 < y2);
    }
};

// Example usage:
int main() {
    Solution sol;
    vector<int> rec1 = {0, 0, 2, 2};
    vector<int> rec2 = {1, 1, 3, 3};
    bool result = sol.isRectangleOverlap(rec1, rec2);
    // Output: true
    return 0;
}
