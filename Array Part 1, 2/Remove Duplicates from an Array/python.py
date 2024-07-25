def remove_duplicates(arr):
    unique_elements = []
    for elem in arr:
        if elem not in unique_elements:
            unique_elements.append(elem)
    return unique_elements

# Test
print(remove_duplicates([1, 2, 2, 3, 4, 4, 5]))  # Output: [1, 2, 3, 4, 5]
