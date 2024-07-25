#include <bits/stdc++.h>
using namespace std;

vector<int> findIntersection(vector<int> array1, vector<int> array2) {
    vector<int> intersectionResult;

    // To maintain visited status for elements in array2
    vector<int> visited(array2.size(), 0);

    for (int i = 0; i < array1.size(); i++) {
        for (int j = 0; j < array2.size(); j++) {
            if (array1[i] == array2[j] && visited[j] == 0) {
                // If element matches and has not been matched with any other before
                intersectionResult.push_back(array2[j]);
                visited[j] = 1;
                break;
            } else if (array2[j] > array1[i]) {
                // Because the array is sorted, element will not be beyond this
                break;
            }
        }
    }

    return intersectionResult;
}

int main() {
    // Array Initialization
    vector<int> array1 {1, 2, 3, 3, 4, 5, 6, 7};
    vector<int> array2 {3, 3, 4, 4, 5, 8};

    vector<int> result = findIntersection(array1, array2);

    for (int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }

    return 0;
}
