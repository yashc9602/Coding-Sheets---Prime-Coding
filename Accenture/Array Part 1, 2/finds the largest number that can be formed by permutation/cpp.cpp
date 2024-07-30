#include <iostream>
#include <algorithm>
#include <vector>

int main() {
    std::string str;
    std::getline(std::cin, str);
    std::string newstr;
    for (char c : str) {
        if (c != ' ') {
            newstr += c;
        }
    }
    std::vector<char> arr(newstr.begin(), newstr.end());
    std::sort(arr.begin(), arr.end());
    for (auto it = arr.rbegin(); it != arr.rend(); ++it) {
        std::cout << *it;
    }
    return 0;
}
