#include <iostream>
using namespace std;

int findMax(int arr[], int size) {
    int max_elem = arr[0];
    for (int i = 1; i < size; i++) {
        if (arr[i] > max_elem) {
            max_elem = arr[i];
        }
    }
    return max_elem;
}

int main() {
    int arr[] = {1, 3, 5, 2, 4};
    int size = sizeof(arr) / sizeof(arr[0]);
    cout << findMax(arr, size) << endl;  // Output: 5
    return 0;
}
