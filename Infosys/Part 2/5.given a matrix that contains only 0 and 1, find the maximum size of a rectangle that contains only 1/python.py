class Solution:
    def maximalRectangle(self, matrix):
        if not matrix:
            return 0
        ans = 0
        m, n = len(matrix), len(matrix[0])
        for start_i in range(m):
            for start_j in range(n):
                for end_i in range(start_i, m):
                    for end_j in range(start_j, n):
                        allOnes = True
                        for i in range(start_i, end_i + 1):
                            for j in range(start_j, end_j + 1):
                                if matrix[i][j] != '1':
                                    allOnes = False
                                    break
                            if not allOnes:
                                break
                        if allOnes:
                            ans = max(ans, (end_i - start_i + 1) * (end_j - start_j + 1))
        return ans

# Example usage:
sol = Solution()
matrix = [
    ['1', '0', '1', '0', '0'],
    ['1', '0', '1', '1', '1'],
    ['1', '1', '1', '1', '1'],
    ['1', '0', '0', '1', '0']
]
result = sol.maximalRectangle(matrix)
print(result)  # Output: 6
