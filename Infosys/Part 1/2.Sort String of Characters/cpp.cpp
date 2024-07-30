// C++ program to sort a string of characters
#include<bits/stdc++.h>
using namespace std;

// function to print string in sorted order
void sortString(string &str)
{
sort(str.begin(), str.end());
cout << str;
}

// Driver program to test above function
int main()
{
	string s = "primecoding"; 
	sortString(s); 
	return 0;
}
