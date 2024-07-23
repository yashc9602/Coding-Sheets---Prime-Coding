def find_max(arr):
    max_elem = arr[0]
    for elem in arr:
        if elem > max_elem:
            max_elem = elem
    return max_elem

# Test
print(find_max([1, 3, 5, 2, 4]))  # Output: 5
