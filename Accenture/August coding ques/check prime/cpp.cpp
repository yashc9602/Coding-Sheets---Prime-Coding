#include <iostream>
#include <cmath>
#include <vector>

bool checkPrime(int n) {
    if (n <= 1)
        return false;
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}

int main() {
    std::vector<int> nums = {10, 20, 30, 40, 50, 60};
    int ans = 0;
    for (int i = 2; i < nums.size(); i++) {
        if (checkPrime(i)) {
            ans += nums[i];
        }
    }
    std::cout << ans << std::endl;
    return 0;
}
