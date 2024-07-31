#include <iostream>
#include <string>
#include <algorithm>
#include <set>
using namespace std;

int main() {
	string str = "The quick brown fox jumps over the dog";
	set<char> present_chars;

	// add each character to the set
	for(int i=0; i<str.length(); i++){
		if (str[i] >= 'a' && str[i] <= 'z'){
			present_chars.insert(str[i]);
		}
		else if (str[i] >= 'A' && str[i] <= 'Z'){
			present_chars.insert(tolower(str[i]));
		}
	}

	// check which characters are missing
	string missing_chars = "";
	for(char c='a'; c<='z'; c++){
		if(present_chars.find(c) == present_chars.end()){
			missing_chars += c;
		}
	}

	// print the missing characters
	if(missing_chars.length() == 0){
		cout << "The string is a pangram." << endl;
	}
	else{
		cout << missing_chars << endl;
	}

	return 0;
}
