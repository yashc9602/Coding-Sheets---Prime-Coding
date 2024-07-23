public class Main {
    public static String reverseString(String s) {
        String reversed_str = "";
        for (int i = 0; i < s.length(); i++) {
            reversed_str = s.charAt(i) + reversed_str;
        }
        return reversed_str;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));  // Output: "olleh"
    }
}
