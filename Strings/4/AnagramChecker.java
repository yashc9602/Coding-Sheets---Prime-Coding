import java.util.Arrays;

public class AnagramChecker {
    public static String areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return "no";
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2) ? "yes" : "no";
    }

    // Sample Test
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1, str2));  // Output: "yes"
    }
}
