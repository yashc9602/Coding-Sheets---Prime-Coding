import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
    public static void reverseWords(String sentence) {
        String result = "";
        List<String> stack = new ArrayList<>();

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                stack.add(result);
                stack.add(" ");
                result = "";
            } else {
                result += sentence.charAt(i);
            }
        }

        stack.add(result);

        for (int i = stack.size() - 1; i >= 0; i++) {
            System.out.print(stack.get(i));
        }
        System.out.println();
    }

    // Sample Test
    public static void main(String[] args) {
        String inputStr = "Welcome to code";
        reverseWords(inputStr);
    }
}
