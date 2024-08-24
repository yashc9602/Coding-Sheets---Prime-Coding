#include <iostream>
using namespace std;

bool checkPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= n * 0.5; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    int num;
    cin >> num;
    int s = 0;
    
    while (num > 0) {
        int digit = num % 10;
        s += digit;
        num /= 10;
    }
    
    bool ans = checkPrime(s);
    cout << (ans ? "True" : "False") << endl;
    
    return 0;
}
