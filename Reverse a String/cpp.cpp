#include <iostream>
using namespace std;

string reverseString(string s) {
    string reversed_str = "";
    for (int i = 0; i < s.length(); i++) {
        reversed_str = s[i] + reversed_str;
    }
    return reversed_str;
}

int main() {
    string str = "hello";
    cout << reverseString(str) << endl;  // Output: "olleh"
    return 0;
}