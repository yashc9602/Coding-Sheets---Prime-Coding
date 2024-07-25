#include <iostream>
#include <vector>
#include <limits.h>

using namespace std;

pair<int, int> findMinAndIndex(const vector<int>& arr) {
    if (arr.empty()) {
        return {-1, -1};  // Return -1 for both value and index if the array is empty
    }

    int minValue = arr[0];
    int minIndex = 0;

    for (size_t i = 1; i < arr.size(); ++i) {
        if (arr[i] < minValue) {
            minValue = arr[i];
            minIndex = i;
        }
    }

    return {minValue, minIndex};
}

int main() {
    vector<int> arr = {3, 1, 4, 1, 5, 9, 2};
    pair<int, int> result = findMinAndIndex(arr);
    cout << "Minimum value: " << result.first << ", Index: " << result.second << endl;
    // Output: Minimum value: 1, Index: 1
    return 0;
}
