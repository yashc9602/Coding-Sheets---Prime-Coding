#include <iostream>
using namespace std;

pair<int, int> maxAndIndex(int arr[], int size) {
    int max_value = arr[0];
    int max_index = 0;
    for (int i = 1; i < size; i++) {
        if (arr[i] > max_value) {
            max_value = arr[i];
            max_index = i;
        }
    }
    return make_pair(max_value, max_index);
}

int main() {
    int arr[] = {1, 3, 7, 9, 2};
    int size = sizeof(arr) / sizeof(arr[0]);
    pair<int, int> result = maxAndIndex(arr, size);
    cout << "Max value: " << result.first << ", Index: " << result.second << endl;  // Output: Max value: 9, Index: 3
    return 0;
}
