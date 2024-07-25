# Write a program that accepts the integer array of length ‘size’ and finds the largest number that can be formed by permutation.

str = input()
newstr = ""
for char in str:
    if char != ' ':
        newstr += char
arr = list(newstr)
arr.sort()
for char in reversed(arr):
    print(char, end='')  # Output should be 9534330
