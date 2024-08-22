#include <iostream>
#include <string>

int main() {
    std::string s;
    std::cin >> s;
    std::string res = "";
    int count = 0;

    for (char c : s) {
        if (c == '0' && count > 0) {
            res += (char)('A' + count - 1);
            count = 0;
        } else {
            count++;
        }
    }

    if (s[s.length() - 1] == '1') {
        res += (char)('A' + count - 1);
    }

    std::cout << res << std::endl;
    return 0;
}
