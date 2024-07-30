def find_min_and_index(arr):
    if not arr:
        return None, -1  # Return None and -1 if the array is empty

    min_value = arr[0]
    min_index = 0

    for i in range(1, len(arr)):
        if arr[i] < min_value:
            min_value = arr[i]
            min_index = i

    return min_value, min_index

# Example usage
arr = [3, 1, 4, 1, 5, 9, 2]
min_value, min_index = find_min_and_index(arr)
print(f"Minimum value: {min_value}, Index: {min_index}")  # Output: Minimum value: 1, Index: 1
