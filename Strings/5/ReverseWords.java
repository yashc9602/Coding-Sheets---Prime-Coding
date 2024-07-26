public class ReverseWords {
    public static String reverseWords(String sentence) {
        StringBuilder word = new StringBuilder();
        String[] words = new String[sentence.length()];
        int wordIndex = 0;
        
        // Split the string into words
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    words[wordIndex++] = word.toString();
                    word = new StringBuilder();
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) {
            words[wordIndex++] = word.toString();
        }

        // Reverse the order of words
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = wordIndex - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }

    // Sample Test
    public static void main(String[] args) {
        String input_str = "Welcome to code";
        System.out.println(reverseWords(input_str));  // Output: "code to Welcome"
        
        input_str = "Code to Crack Puzzle";
        System.out.println(reverseWords(input_str));  // Output: "Puzzle Crack to Code"
    }
}
