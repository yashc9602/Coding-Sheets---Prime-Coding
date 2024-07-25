def SmallLargeSum(array):
    if len(array) <= 3:
        return 0

    even_elements = []
    odd_elements = []

    # Separate elements based on their positions
    for i in range(len(array)):
        if i % 2 == 0:
            even_elements.append(array[i])
        else:
            odd_elements.append(array[i])

    # Find second largest in even_elements
    if len(even_elements) < 2:
        return 0
    max1_even = float('-inf')
    max2_even = float('-inf')
    for num in even_elements:
        if num > max1_even:
            max2_even = max1_even
            max1_even = num
        elif num > max2_even:
            max2_even = num

    # Find second largest in odd_elements
    if len(odd_elements) < 2:
        return 0
    max1_odd = float('-inf')
    max2_odd = float('-inf')
    for num in odd_elements:
        if num > max1_odd:
            max2_odd = max1_odd
            max1_odd = num
        elif num > max2_odd:
            max2_odd = num

    return max2_even + max2_odd

# Sample test cases
print(SmallLargeSum([3, 2, 1, 7, 5, 4]))  # Output: 7
print(SmallLargeSum([4, 0, 7, 9, 6, 4, 2]))  # Output: 10
