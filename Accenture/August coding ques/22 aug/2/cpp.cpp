#include <iostream>
#include <cmath>

bool checkPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= std::sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}

bool checkGoogly(int num) {
    int s = 0;
    while (num > 0) {
        int digit = num % 10;
        s += digit;
        num /= 10;
    }
    return checkPrime(s);
}

int main() {
    int num = 22;
    std::cout << std::boolalpha << checkGoogly(num) << std::endl;
    return 0;
}
