#include <iostream>
#include <vector>
using namespace std;

vector<int> removeDuplicates(int arr[], int size) {
    vector<int> unique_elements;
    for (int i = 0; i < size; i++) {
        bool isDuplicate = false;
        for (int j = 0; j < unique_elements.size(); j++) {
            if (arr[i] == unique_elements[j]) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            unique_elements.push_back(arr[i]);
        }
    }
    return unique_elements;
}

int main() {
    int arr[] = {1, 2, 2, 3, 4, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    vector<int> result = removeDuplicates(arr, size);
    for (int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }
    cout << endl;  // Output: 1 2 3 4 5
    return 0;
}
