def binary_and(s1, s2):
    result = ""
    for i in range(len(s1)):
        if s1[i] == '1' and s2[i] == '1':
            result += '1'
        else:
            result += '0'
    return result

def binary_or(s1, s2):
    result = ""
    for i in range(len(s1)):
        if s1[i] == '1' or s2[i] == '1':
            result += '1'
        else:
            result += '0'
    return result

def binary_xor(s1, s2):
    result = ""
    for i in range(len(s1)):
        if s1[i] == s2[i]:
            result += '0'
        else:
            result += '1'
    return result

# Sample Test
s1 = input()
s2 = input()
operator = input()
if operator == "AND":
    print(binary_and(s1, s2))  # Output: "1001"
elif operator == "OR":
    print(binary_or(s1, s2))   # Output: "1111"
else:
    print(binary_xor(s1, s2))  # Output: "0110"
