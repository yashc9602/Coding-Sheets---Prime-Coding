public class BinaryOperations {
    public static String binaryAnd(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '1' && s2.charAt(i) == '1') {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        return result.toString();
    }

    public static String binaryOr(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '1' || s2.charAt(i) == '1') {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        return result.toString();
    }

    public static String binaryXor(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                result.append('0');
            } else {
                result.append('1');
            }
        }
        return result.toString();
    }

    // Sample Test
    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "1011";
        System.out.println(binaryAnd(s1, s2));  // Output: "1001"
        System.out.println(binaryOr(s1, s2));   // Output: "1111"
        System.out.println(binaryXor(s1, s2));  // Output: "0110"
    }
}
