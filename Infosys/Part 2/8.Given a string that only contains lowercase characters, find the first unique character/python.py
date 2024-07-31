class Solution:
    def firstUniqChar(self, s: str) -> int:
        from collections import defaultdict
        m = defaultdict(lambda: [0, 0])
        idx = len(s)
        for i, c in enumerate(s):
            m[c][0] += 1
            m[c][1] = i
        for c, p in m.items():
            if p[0] == 1:
                idx = min(idx, p[1])
        return idx if idx != len(s) else -1

# Example usage:
sol = Solution()
s = "leetcode"
result = sol.firstUniqChar(s)
print(result)  # Output: 0
