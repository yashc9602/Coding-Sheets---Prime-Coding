#include <iostream>
using namespace std;

int kthLargest(int arr[], int size, int k) {
    for (int i = 0; i < k; i++) {
        int max_index = i;
        for (int j = i + 1; j < size; j++) {
            if (arr[j] > arr[max_index]) {
                max_index = j;
            }
        }
        swap(arr[i], arr[max_index]);
    }
    return arr[k-1];
}

int main() {
    int arr[] = {3, 2, 1, 5, 6, 4};
    int size = sizeof(arr) / sizeof(arr[0]);
    int k = 2;
    cout << kthLargest(arr, size, k) << endl;  // Output: 5
    return 0;
}
