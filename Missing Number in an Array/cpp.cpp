#include <iostream>
using namespace std;

int findMissing(int arr[], int size) {
    int n = size + 1;
    int total_sum = n * (n + 1) / 2;
    int array_sum = 0;
    for (int i = 0; i < size; i++) {
        array_sum += arr[i];
    }
    return total_sum - array_sum;
}

int main() {
    int arr[] = {1, 2, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    cout << findMissing(arr, size) << endl;  // Output: 3
    return 0;
}
