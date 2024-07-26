public class ReplaceCharacter {
    public static String replaceCharacter(String str, char ch1, char ch2) {
        char[] result = str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == ch1) {
                result[i] = ch2;
            } else if (result[i] == ch2) {
                result[i] = ch1;
            }
        }
        return new String(result);
    }

    // Sample Test
    public static void main(String[] args) {
        String str = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        System.out.println(replaceCharacter(str, ch1, ch2));  // Output: "paales"
    }
}
