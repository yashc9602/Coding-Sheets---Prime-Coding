#include <iostream> 
#include <utility> 
using namespace std; 
  
// Driver Program 
int main () 
{ 
    int a[] = {1, 2, 3, 4}; 
    int b[] = {5, 6, 7, 8}; 
    int n = sizeof(a)/sizeof(a[0]); 
  
    swap(a, b); 
  
    cout << "a[] = "; 
    for (int i=0; i<n; i++) 
        cout << a[i] << ", "; 
  
    cout << "\nb[] = "; 
    for (int i=0; i<n; i++) 
        cout << b[i] << ", "; 
  
    return 0; 
} 