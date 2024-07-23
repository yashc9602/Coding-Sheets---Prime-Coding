#include <iostream>
#include <climits>
using namespace std;

int secondLargest(int arr[], int size) {
    int first = INT_MIN, second = INT_MIN;
    for (int i = 0; i < size; i++) {
        if (arr[i] > first) {
            second = first;
            first = arr[i];
        } else if (arr[i] > second && arr[i] != first) {
            second = arr[i];
        }
    }
    return second;
}

int main() {
    int arr[] = {1, 3, 5, 2, 4};
    int size = sizeof(arr) / sizeof(arr[0]);
    cout << secondLargest(arr, size) << endl;  // Output: 4
    return 0;
}
