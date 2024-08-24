import java.util.Scanner;

public class Main {
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n * 0.5; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int s = 0;
        
        while (num > 0) {
            int digit = num % 10;
            s += digit;
            num /= 10;
        }
        
        boolean ans = checkPrime(s);
        System.out.println(ans ? "True" : "False");
    }
}
