public class ReplaceCharacters {
    public static String replaceCharacters(String str, char ch1, char ch2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ch1) {
                result.append(ch2);
            } else if (c == ch2) {
                result.append(ch1);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    // Sample Test
    public static void main(String[] args) {
        String input_str = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        String output_str = replaceCharacters(input_str, ch1, ch2);
        System.out.println(output_str);  // Output: "paales"
    }
}
