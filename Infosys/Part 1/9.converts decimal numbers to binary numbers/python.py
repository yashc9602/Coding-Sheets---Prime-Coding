# Python3 program to convert a 
# decimal number to binary number

# function to convert
# decimal to binary
def decToBinary(n):
    
    # array to store
    # binary number
    binaryNum = [0] * n

    # counter for binary array
    i = 0;
    while (n > 0): 

        # storing remainder
        # in binary array
        binaryNum[i] = n % 2
        n = int(n / 2)
        i += 1

    # printing binary array
    # in reverse order
    for j in range(i - 1, -1, -1):
        print(binaryNum[j], end = "")

# Driver Code
n = 17
decToBinary(n)
