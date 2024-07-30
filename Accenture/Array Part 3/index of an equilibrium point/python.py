def find_equilibrium_point(arr):
    total_sum = sum(arr)
    left_sum = 0
    
    for i, num in enumerate(arr):
        total_sum -= num
        if left_sum == total_sum:
            return i
        left_sum += num
    
    return -1

# Example usage
arr = [1, 3, 5, 2, 2]
index = find_equilibrium_point(arr)
print("Equilibrium index:", index)
