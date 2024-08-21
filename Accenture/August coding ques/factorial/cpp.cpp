#include <iostream>
#include <string>

int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

int main() {
    std::string vowels = "aeiouAEIOU";
    std::string s = "AFBC";
    int count = 0;
    
    for (char c : s) {
        if (vowels.find(c) == std::string::npos) {
            count++;
        }
    }
    
    int ans = factorial(count);
    std::cout << ans << std::endl;

    return 0;
}
