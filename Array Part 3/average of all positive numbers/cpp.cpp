#include <iostream>
#include <vector>
using namespace std;

double averageOfPositiveNumbers(vector<int>& arr) {
    int totalSum = 0, count = 0;
    
    for (int num : arr) {
        if (num > 0) {
            totalSum += num;
            count++;
        }
    }
    
    if (count == 0) {
        return 0;  // Return 0 if no positive numbers found
    }
    return static_cast<double>(totalSum) / count;
}

int main() {
    vector<int> arr = {1, -3, 5, 7, -2, 4, -1};
    double average = averageOfPositiveNumbers(arr);
    cout << "Average of positive numbers: " << average << endl;
    return 0;
}
