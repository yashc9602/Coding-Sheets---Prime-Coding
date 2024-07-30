class Solution:
    def largestNumber(self, nums):
        nums = list(map(str, nums))
        nums.sort(key=lambda x: x*10, reverse=True)
        largest_num = ''.join(nums)
        return largest_num.lstrip('0') or '0'

# Driver Code
solution = Solution()
nums = [3, 30, 34, 5, 9]
print("Largest Number:", solution.largestNumber(nums))
