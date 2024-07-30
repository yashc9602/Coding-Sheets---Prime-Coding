// Java program of the above approach
import java.util.*;

class PRIME{

// Program to count the number of
// unique characters in a string
static int cntDistinct(String str)
{
	
	// Set to store unique characters
	// in the given string
	HashSet<Character> s = new HashSet<Character>();

	// Loop to traverse the string
	for(int i = 0; i < str.length(); i++) 
	{
		
		// Insert current character
		// into the set
		s.add(str.charAt(i));
	}

	// Return Answer
	return s.size();
}

// Driver Code
public static void main(String args[]) 
{
	String str = "primecoding";
	System.out.print(cntDistinct(str));
}
}

