#include <iostream>
#include <vector>
using namespace std;

int countOccurrences(const vector<int>& arr, int target) {
    int count = 0;
    for (int num : arr) {
        if (num == target) {
            count++;
        }
    }
    return count;
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5, 3, 3};
    int target = 3;
    cout << "Occurrences of " << target << ": " << countOccurrences(arr, target) << endl;  // Output: 3
    return 0;
}
