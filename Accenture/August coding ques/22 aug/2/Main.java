public class Main {
    public static boolean checkPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean checkGoogly(int num) {
        int s = 0;
        while (num > 0) {
            int digit = num % 10;
            s += digit;
            num /= 10;
        }
        return checkPrime(s);
    }

    public static void main(String[] args) {
        int num = 22;
        System.out.println(checkGoogly(num));
    }
}
