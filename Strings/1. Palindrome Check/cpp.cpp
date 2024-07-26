#include <iostream>
using namespace std;

bool isPalindrome(string s) {
    int left = 0;
    int right = s.length() - 1;
    
    while (left < right) {
        if (s[left] != s[right]) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

// Sample Test
int main() {
    cout << isPalindrome("madam") << endl;  // Output: 1 (true)
    cout << isPalindrome("hello") << endl;  // Output: 0 (false)
    return 0;
}
