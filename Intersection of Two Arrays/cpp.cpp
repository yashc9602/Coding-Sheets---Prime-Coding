#include <iostream>
#include <vector>
using namespace std;

vector<int> intersection(int arr1[], int size1, int arr2[], int size2) {
    vector<int> result;
    for (int i = 0; i < size1; i++) {
        bool found = false;
        for (int j = 0; j < size2; j++) {
            if (arr1[i] == arr2[j]) {
                found = true;
                for (int k = 0; k < result.size(); k++) {
                    if (result[k] == arr1[i]) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    result.push_back(arr1[i]);
                }
                break;
            }
        }
    }
    return result;
}

int main() {
    int arr1[] = {1, 2, 2, 3, 4};
    int arr2[] = {2, 2, 3, 5};
    int size1 = sizeof(arr1) / sizeof(arr1[0]);
    int size2 = sizeof(arr2) / sizeof(arr2[0]);
    vector<int> result = intersection(arr1, size1, arr2, size2);
    for (int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }
    cout << endl;  // Output: 2 3
    return 0;
}
