public class Main {
    public static int sum_of_divisors(int N) {
        int sum_div = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                sum_div += i;
            }
        }
        return sum_div;
    }

    public static void main(String[] args) {
        int N = 12;
        System.out.println("The sum of the divisors of " + N + " is " + sum_of_divisors(N));  // Output should be 28
    }
}
