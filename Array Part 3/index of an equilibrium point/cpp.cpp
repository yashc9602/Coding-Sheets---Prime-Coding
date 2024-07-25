#include <iostream>
#include <vector>
using namespace std;

int findEquilibriumPoint(vector<int>& arr) {
    int totalSum = 0, leftSum = 0;
    for (int num : arr) {
        totalSum += num;
    }
    
    for (int i = 0; i < arr.size(); ++i) {
        totalSum -= arr[i]; // This is now the right sum
        if (leftSum == totalSum) {
            return i;
        }
        leftSum += arr[i];
    }
    return -1;
}

int main() {
    vector<int> arr = {1, 3, 5, 2, 2};
    int index = findEquilibriumPoint(arr);
    cout << "Equilibrium index: " << index << endl;
    return 0;
}
