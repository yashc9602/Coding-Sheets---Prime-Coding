#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

pair<int, int> findPairWithSum(vector<int> &array, int target_sum) {
    unordered_map<int, bool> seenNumbers;
    for (int number : array) {
        int complement = target_sum - number;
        if (seenNumbers.count(complement)) {
            return make_pair(complement, number);
        }
        seenNumbers[number] = true;
    }
    return make_pair(-1, -1); // Return a pair of -1 if no pair found
}

int main() {
    vector<int> array = {1, 2, 3, 4, 6};
    int target_sum = 8;
    pair<int, int> result = findPairWithSum(array, target_sum);
    if (result.first != -1) {
        cout << "Pair found: (" << result.first << ", " << result.second << ")" << endl;
    } else {
        cout << "No pair found" << endl;
    }
    return 0;
}
