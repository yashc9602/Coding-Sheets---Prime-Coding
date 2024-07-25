# Write a program that accepts the integer array of length ‘size’ and finds the largest number that can be formed by permutation.

def compare(a, b):
    return (str(a) + str(b)) > (str(b) + str(a))

def custom_sort(arr):
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if not compare(arr[i], arr[j]):
                arr[i], arr[j] = arr[j], arr[i]

def largest_number(arr):
    custom_sort(arr)
    result = ''.join(map(str, arr))
    return result if result[0] != '0' else '0'

# Example usage
arr = [3, 30, 34, 5, 9]
print(f"The largest number formed is {largest_number(arr)}")  # Output should be 9534330
