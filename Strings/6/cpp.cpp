#include <iostream>
#include <string>

std::string transformString(std::string str) {
    for (char &c : str) {
        if (c == 'a')
            c = 'b';
        else if (c == 'b')
            c = 'a';
    }
    return str;
}

int main() {
    std::string str = "abaabbcc";
    std::cout << transformString(str) << std::endl;
    return 0;
}