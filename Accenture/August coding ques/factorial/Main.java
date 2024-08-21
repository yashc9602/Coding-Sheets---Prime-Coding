public class Main {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        String vowels = "aeiouAEIOU";
        String s = "AFBC";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) == -1) {
                count++;
            }
        }

        int ans = factorial(count);
        System.out.println(ans);
    }
}
