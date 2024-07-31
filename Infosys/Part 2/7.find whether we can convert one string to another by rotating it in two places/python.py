class Solution:
    def rotateString(self, A: str, B: str) -> bool:
        if len(A) != len(B):
            return False
        if A == B:  # for empty strings or identical strings
            return True

        lenB = len(B)
        while lenB > 0:
            if A == B:
                return True
            A = A[1:] + A[0]  # one shift on A
            lenB -= 1
        return False

# Example usage:
sol = Solution()
A = "abcde"
B = "cdeab"
result = sol.rotateString(A, B)
print(result)  # Output: true
