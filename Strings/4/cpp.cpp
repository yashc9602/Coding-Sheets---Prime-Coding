#include <iostream>
#include <algorithm>
using namespace std;

string areAnagrams(string str1, string str2) {
    if (str1.length() != str2.length()) {
        return "no";
    }
    sort(str1.begin(), str1.end());
    sort(str2.begin(), str2.end());
    return str1 == str2 ? "yes" : "no";
}

// Sample Test
int main() {
    string str1 = "listen";
    string str2 = "silent";
    cout << areAnagrams(str1, str2) << endl;  // Output: "yes"
    return 0;
}
