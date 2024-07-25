#include <iostream>
using namespace std;

int sum_of_divisors(int N) {
    int sum_div = 0;
    for (int i = 1; i <= N; i++) {
        if (N % i == 0) {
            sum_div += i;
        }
    }
    return sum_div;
}

int main() {
    int N = 12;
    cout << "The sum of the divisors of " << N << " is " << sum_of_divisors(N) << endl;  // Output should be 28
    return 0;
}
