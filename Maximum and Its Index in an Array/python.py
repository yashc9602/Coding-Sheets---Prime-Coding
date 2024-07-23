def max_and_index(arr):
    max_value = arr[0]
    max_index = 0
    for i in range(1, len(arr)):
        if arr[i] > max_value:
            max_value = arr[i]
            max_index = i
    return max_value, max_index

# Test
print(max_and_index([1, 3, 7, 9, 2]))  # Output: (9, 3)
