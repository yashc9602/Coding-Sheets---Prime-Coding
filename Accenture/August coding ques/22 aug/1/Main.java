import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String res = "";
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '0' && count == 0) {
                count = 0;
            } else if (c == '0' && count > 0) {
                res += (char)('A' + count - 1);
                count = 0;
            } else {
                count++;
            }
        }
        
        if (s.charAt(s.length() - 1) == '1') {
            res += (char)('A' + count - 1);
        }
        
        System.out.println(res);
    }
}
