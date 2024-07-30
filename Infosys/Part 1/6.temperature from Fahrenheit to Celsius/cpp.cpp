#include <iostream>
#include <iomanip>
using namespace std;

void fahrenheitToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32) * 5 / 9;
    cout << "Temperature in Celsius: " << fixed << setprecision(3) << celsius << endl;
}

int main() {
    double fahrenheit = 40;
    fahrenheitToCelsius(fahrenheit);
    return 0;
}
