def swap_arrays(a, b):
    n = len(a)
    temp = a[:]
    for i in range(n):
        a[i] = b[i]
        b[i] = temp[i]

# Driver Program
a = [1, 2, 3, 4]
b = [5, 6, 7, 8]
swap_arrays(a, b)

print("a[] =", a)
print("b[] =", b)
