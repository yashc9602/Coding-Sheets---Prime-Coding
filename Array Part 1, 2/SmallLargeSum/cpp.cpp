#include <iostream>
#include <vector>
#include <limits.h>
using namespace std;

int SmallLargeSum(vector<int>& array) {
    if (array.size() <= 3) {
        return 0;
    }

    vector<int> even_elements;
    vector<int> odd_elements;

    // Separate elements based on their positions
    for (int i = 0; i < array.size(); ++i) {
        if (i % 2 == 0) {
            even_elements.push_back(array[i]);
        } else {
            odd_elements.push_back(array[i]);
        }
    }

    // Find second largest in even_elements
    if (even_elements.size() < 2) {
        return 0;
    }
    int max1_even = INT_MIN;
    int max2_even = INT_MIN;
    for (int num : even_elements) {
        if (num > max1_even) {
            max2_even = max1_even;
            max1_even = num;
        } else if (num > max2_even) {
            max2_even = num;
        }
    }

    // Find second largest in odd_elements
    if (odd_elements.size() < 2) {
        return 0;
    }
    int max1_odd = INT_MIN;
    int max2_odd = INT_MIN;
    for (int num : odd_elements) {
        if (num > max1_odd) {
            max2_odd = max1_odd;
            max1_odd = num;
        } else if (num > max2_odd) {
            max2_odd = num;
        }
    }

    return max2_even + max2_odd;
}

// Sample test cases
int main() {
    vector<int> array1 = {3, 2, 1, 7, 5, 4};
    cout << SmallLargeSum(array1) << endl;  // Output: 7

    vector<int> array2 = {4, 0, 7, 9, 6, 4, 2};
    cout << SmallLargeSum(array2) << endl;  // Output: 10

    return 0;
}
