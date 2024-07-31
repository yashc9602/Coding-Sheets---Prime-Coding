class Solution:
    def triangularSum(self, nums):
        n = len(nums)
        for i in range(n - 1, 0, -1):
            for j in range(i):
                nums[j] = (nums[j] + nums[j + 1]) % 10
        return nums[0]

# Example usage:
sol = Solution()
nums = [1, 2, 3, 4, 5]
result = sol.triangularSum(nums)
print(result)  # Output: 8
