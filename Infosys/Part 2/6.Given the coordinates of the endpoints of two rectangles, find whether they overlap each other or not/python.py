class Solution:
    def isRectangleOverlap(self, rec1, rec2):
        x1, y1, x2, y2 = rec1
        x3, y3, x4, y4 = rec2
        return (x1 < x4 and x3 < x2 and y1 < y4 and y3 < y2)

# Example usage:
sol = Solution()
rec1 = [0, 0, 2, 2]
rec2 = [1, 1, 3, 3]
result = sol.isRectangleOverlap(rec1, rec2)
print(result)  # Output: true
