#include <string>
using namespace std;

class Solution {
public:
    bool rotateString(string A, string B) {
        if (A.size() != B.size())
            return false;
        if (A == B)  // for empty strings or identical strings
            return true;

        int len = B.size();
        while (len--) {
            if (A == B)
                return true;
            A = A.substr(1) + A[0];  // one shift on A
        }
        return false;
    }
};

// Example usage:
int main() {
    Solution sol;
    string A = "abcde";
    string B = "cdeab";
    bool result = sol.rotateString(A, B);
    // Output: true
    return 0;
}
