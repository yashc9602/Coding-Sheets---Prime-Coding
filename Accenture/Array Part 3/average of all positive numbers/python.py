def average_of_positive_numbers(arr):
    total_sum = 0
    count = 0
    
    for num in arr:
        if num > 0:
            total_sum += num
            count += 1
    
    if count == 0:
        return 0  # Return 0 or appropriate value if no positive numbers found
    return total_sum / count

# Example usage
arr = [1, -3, 5, 7, -2, 4, -1]
average = average_of_positive_numbers(arr)
print(f"Average of positive numbers: {average}")
