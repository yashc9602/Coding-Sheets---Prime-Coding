#include <iostream>
#include <unordered_map>
using namespace std;

unordered_map<int, int> countOccurrences(int arr[], int size) {
    unordered_map<int, int> counts;
    for (int i = 0; i < size; i++) {
        if (counts.find(arr[i]) != counts.end()) {
            counts[arr[i]] += 1;
        } else {
            counts[arr[i]] = 1;
        }
    }
    return counts;
}

int main() {
    int arr[] = {1, 2, 2, 3, 4, 4, 5, 5, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    unordered_map<int, int> result = countOccurrences(arr, size);
    for (auto& pair : result) {
        cout << pair.first << ": " << pair.second << endl;
    }
    // Output:
    // 1: 1
    // 2: 2
    // 3: 1
    // 4: 2
    // 5: 3
    return 0;
}
