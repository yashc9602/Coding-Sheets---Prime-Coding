def reverse(arr, start, end):
    while start < end:
        arr[start], arr[end] = arr[end], arr[start]
        start += 1
        end -= 1

def rotate_array(arr, d):
    n = len(arr)
    d = d % n  # In case d is greater than n
    reverse(arr, 0, n-1)
    reverse(arr, 0, d-1)
    reverse(arr, d, n-1)

# Example usage
arr = [1, 2, 3, 4, 5, 6, 7]
d = 2
rotate_array(arr, d)
print("Rotated array:", arr)
