class Solution:
    def nextPermutation(self, nums):
        n = len(nums)
        k = l = -1
        for k in range(n - 2, -1, -1):
            if nums[k] < nums[k + 1]:
                break
        else:
            nums.reverse()
            return

        for l in range(n - 1, k, -1):
            if nums[l] > nums[k]:
                break

        nums[k], nums[l] = nums[l], nums[k]
        nums[k + 1:] = reversed(nums[k + 1:])

# Example usage:
sol = Solution()
nums = [1, 2, 3]
sol.nextPermutation(nums)
print(nums)  # Output: [1, 3, 2]
