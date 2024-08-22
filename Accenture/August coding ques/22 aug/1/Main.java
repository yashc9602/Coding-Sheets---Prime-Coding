import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder res = new StringBuilder();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '0' && count > 0) {
                res.append((char)('A' + count - 1));
                count = 0;
            } else {
                count++;
            }
        }

        if (s.charAt(s.length() - 1) == '1') {
            res.append((char)('A' + count - 1));
        }

        System.out.println(res.toString());
    }
}
