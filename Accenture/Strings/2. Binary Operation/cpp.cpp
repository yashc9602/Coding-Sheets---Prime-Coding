#include <iostream>
#include <string>
using namespace std;

string binaryAnd(string s1, string s2) {
    string result = "";
    for (int i = 0; i < s1.length(); i++) {
        if (s1[i] == '1' && s2[i] == '1') {
            result += '1';
        } else {
            result += '0';
        }
    }
    return result;
}

string binaryOr(string s1, string s2) {
    string result = "";
    for (int i = 0; i < s1.length(); i++) {
        if (s1[i] == '1' || s2[i] == '1') {
            result += '1';
        } else {
            result += '0';
        }
    }
    return result;
}

string binaryXor(string s1, string s2) {
    string result = "";
    for (int i = 0; i < s1.length(); i++) {
        if (s1[i] == s2[i]) {
            result += '0';
        } else {
            result += '1';
        }
    }
    return result;
}
// Sample Test
int main() {
    string s1 = "1101";
    string s2 = "1011";
    cout << binaryAnd(s1, s2) << endl;  // Output: "1001"
    cout << binaryOr(s1, s2) << endl;   // Output: "1111"
    cout << binaryXor(s1, s2) << endl;  // Output: "0110"
    return 0;
}

