def count_occurrences(arr):
    counts = {}
    for elem in arr:
        if elem in counts:
            counts[elem] += 1
        else:
            counts[elem] = 1
    return counts

# Test
print(count_occurrences([1, 2, 2, 3, 4, 4, 5, 5, 5]))  # Output: {1: 1, 2: 2, 3: 1, 4: 2, 5: 3}
