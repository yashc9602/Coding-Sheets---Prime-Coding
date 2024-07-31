import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the dog";
		HashSet<Character> presentChars = new HashSet<>();

		// add each character to the set
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z'){
				presentChars.add(c);
			}
			else if (c >= 'A' && c <= 'Z'){
				presentChars.add(Character.toLowerCase(c));
			}
		}

		// check which characters are missing
		StringBuilder missingChars = new StringBuilder();
		for(char c = 'a'; c <= 'z'; c++){
			if(!presentChars.contains(c)){
				missingChars.append(c);
			}
		}

		// print the missing characters
		if(missingChars.length() == 0){
			System.out.println("The string is a pangram.");
		}
		else{
			System.out.println(missingChars);
		}
	}
}
