#include <iostream>
#include <vector>
using namespace std;

string reverseWords(string sentence) {
    vector<string> words;
    string word = "";
    
    // Split the string into words
    for (char c : sentence) {
        if (c == ' ') {
            if (!word.empty()) {
                words.push_back(word);
                word = "";
            }
        } else {
            word += c;
        }
    }
    if (!word.empty()) {
        words.push_back(word);
    }

    // Reverse the order of words
    string reversed_sentence = "";
    for (int i = words.size() - 1; i >= 0; i--) {
        reversed_sentence += words[i];
        if (i != 0) {
            reversed_sentence += " ";
        }
    }

    return reversed_sentence;
}

// Sample Test
int main() {
    string input_str = "Welcome to code";
    cout << reverseWords(input_str) << endl;  // Output: "code to Welcome"
    
    input_str = "Code to Crack Puzzle";
    cout << reverseWords(input_str) << endl;  // Output: "Puzzle Crack to Code"
    
    return 0;
}
