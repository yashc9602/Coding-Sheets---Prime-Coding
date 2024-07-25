def find_missing(arr):
    n = len(arr) + 1
    total_sum = n * (n + 1) // 2
    array_sum = sum(arr)
    return total_sum - array_sum

# Test
print(find_missing([1, 2, 4, 5]))  # Output: 3
