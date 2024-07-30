// C++ program to find the area of
// incircle of right angled triangle
#include <bits/stdc++.h>
using namespace std;
#define PI 3.14159265

// Function to find area of
// incircle
float area_inscribed(float P, float B, float H)
{
	return ((P + B - H) * (P + B - H) * (PI / 4));
}

// Driver code
int main()
{
	float P = 3, B = 4, H = 5;
	cout << area_inscribed(P, B, H) << endl;

	return 0;
}

