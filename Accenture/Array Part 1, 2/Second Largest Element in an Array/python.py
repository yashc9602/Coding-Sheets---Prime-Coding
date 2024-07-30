def second_largest(arr):
    first = second = float('-inf')
    for num in arr:
        if num > first:
            second = first
            first = num
        elif num > second and num != first:
            second = num
    return second

# Test
print(second_largest([1, 3, 5, 2, 4]))  # Output: 4
