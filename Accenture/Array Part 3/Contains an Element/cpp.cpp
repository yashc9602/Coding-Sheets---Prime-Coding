#include <iostream>
#include <vector>
using namespace std;

bool containsElement(const vector<int>& arr, int target) {
    for (int num : arr) {
        if (num == target) {
            return true;
        }
    }
    return false;
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5};
    int target = 3;
    if (containsElement(arr, target)) {
        cout << "The array contains the element " << target << endl;
    } else {
        cout << "The array does not contain the element " << target << endl;
    }
    return 0;
}
