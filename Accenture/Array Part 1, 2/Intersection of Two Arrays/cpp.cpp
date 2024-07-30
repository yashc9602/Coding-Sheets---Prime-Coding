#include <bits/stdc++.h>
using namespace std;

vector<int> intersection(vector<int>& arr1, vector<int>& arr2) {
    int i = 0, j = 0;
    vector<int> ans;
    
    while (i < arr1.size() && j < arr2.size()) {
        if (arr1[i] < arr2[j]) {
            i++;
        } else if (arr2[j] < arr1[i]) {
            j++;
        } else {
            ans.push_back(arr1[i]);
            i++;
            j++;
        }
    }
    
    return ans;
}

int main() {
    vector<int> arr1 = {1, 2, 2, 3, 4};
    vector<int> arr2 = {2, 2, 3, 5};
    vector<int> result = intersection(arr1, arr2);
    
    for (int num : result) {
        cout << num << " ";
    }
    
    return 0;
}
