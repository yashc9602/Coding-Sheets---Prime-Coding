#include <iostream>
#include <vector>
using namespace std;

void reverse(vector<int>& arr, int start, int end) {
    while (start < end) {
        swap(arr[start], arr[end]);
        start++;
        end--;
    }
}

void rotateArray(vector<int>& arr, int d) {
    int n = arr.size();
    d = d % n;  // In case d is greater than n
    reverse(arr, 0, n - 1);
    reverse(arr, 0, d - 1);
    reverse(arr, d, n - 1);
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5, 6, 7};
    int d = 2;
    rotateArray(arr, d);
    cout << "Rotated array: ";
    for (int i = 0; i < arr.size(); i++) {
        cout << arr[i] << " ";
    }
    return 0;
}
