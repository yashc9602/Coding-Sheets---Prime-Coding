def count_occurrences(arr, target):
    count = 0
    for num in arr:
        if num == target:
            count += 1
    return count

# Example usage
arr = [1, 2, 3, 4, 5, 3, 3]
target = 3
print(f"Occurrences of {target}: {count_occurrences(arr, target)}")  # Output: 3
