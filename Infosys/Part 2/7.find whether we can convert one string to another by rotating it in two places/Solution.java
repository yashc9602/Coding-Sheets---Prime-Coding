public class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length())
            return false;
        if (A.equals(B))  // for empty strings or identical strings
            return true;

        int len = B.length();
        while (len-- > 0) {
            if (A.equals(B))
                return true;
            A = A.substring(1) + A.charAt(0);  // one shift on A
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String A = "abcde";
        String B = "cdeab";
        boolean result = sol.rotateString(A, B);
        System.out.println(result);  // Output: true
    }
}
