#include <iostream>
#include <string>
using namespace std;

string replaceCharacter(const string& str, char ch1, char ch2) {
    string result = str;
    for (char& c : result) {
        if (c == ch1) {
            c = ch2;
        } else if (c == ch2) {
            c = ch1;
        }
    }
    return result;
}

// Sample Test
int main() {
    string str = "apples";
    char ch1 = 'a';
    char ch2 = 'p';
    cout << replaceCharacter(str, ch1, ch2) << endl;  // Output: "paales"
    return 0;
}
