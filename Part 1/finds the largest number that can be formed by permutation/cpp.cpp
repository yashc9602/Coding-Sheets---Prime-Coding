// Write a program that accepts the integer array of length ‘size’ and finds the largest number that can be formed by permutation.

#include <iostream>
#include <vector>
#include <string>
using namespace std;

bool compare(int a, int b) {
    string ab = to_string(a) + to_string(b);
    string ba = to_string(b) + to_string(a);
    return ab > ba;
}

void custom_sort(vector<int> &arr) {
    for (int i = 0; i < arr.size(); i++) {
        for (int j = i + 1; j < arr.size(); j++) {
            if (!compare(arr[i], arr[j])) {
                swap(arr[i], arr[j]);
            }
        }
    }
}

string largest_number(vector<int> &arr) {
    custom_sort(arr);
    string result;
    for (int num : arr) {
        result += to_string(num);
    }
    return result[0] == '0' ? "0" : result;
}

int main() {
    vector<int> arr = {3, 30, 34, 5, 9};
    cout << "The largest number formed is " << largest_number(arr) << endl;  // Output should be 9534330
    return 0;
}
