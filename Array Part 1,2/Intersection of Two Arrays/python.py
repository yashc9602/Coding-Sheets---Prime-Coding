def intersection(arr1, arr2):
    result = []
    for num in arr1:
        if num in arr2 and num not in result:
            result.append(num)
    return result

# Test
print(intersection([1, 2, 2, 3, 4], [2, 2, 3, 5]))  # Output: [2, 3]
