#include <iostream>
using namespace std;

string replaceCharacters(string str, char ch1, char ch2) {
    string result = "";

    for (char c : str) {
        if (c == ch1) {
            result += ch2;
        } else if (c == ch2) {
            result += ch1;
        } else {
            result += c;
        }
    }

    return result;
}

// Sample Test
int main() {
    string input_str = "apples";
    char ch1 = 'a';
    char ch2 = 'p';
    string output_str = replaceCharacters(input_str, ch1, ch2);
    cout << output_str << endl;  // Output: "paales"
    
    return 0;
}
