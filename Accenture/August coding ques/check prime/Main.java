public class Main {

    public static boolean checkPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int ans = 0;
        for (int i = 2; i < nums.length; i++) {
            if (checkPrime(i)) {
                ans += nums[i];
            }
        }
        System.out.println(ans);
    }
}
