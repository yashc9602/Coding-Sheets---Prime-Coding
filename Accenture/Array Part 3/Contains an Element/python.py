def contains_element(arr, target):
    for num in arr:
        if num == target:
            return True
    return False

# Example usage
arr = [1, 2, 3, 4, 5]
target = 3
print(contains_element(arr, target))  # Output: True
