#include <iostream>
#include <vector>
#include <string>
using namespace std;

void reverse_words(const string& sentence) {
    string result = "";
    vector<string> stack;

    for (size_t i = 0; i < sentence.length(); ++i) {
        if (sentence[i] == ' ') {
            stack.push_back(result);
            stack.push_back(" ");
            result = "";
        } else {
            result += sentence[i];
        }
    }

    stack.push_back(result);

    for (int i = stack.size() - 1; i >= 0; --i) {
        cout << stack[i];
    }
    cout << endl;
}

// Sample Test
int main() {
    string input_str = "Welcome to code";
    reverse_words(input_str);
    return 0;
}
