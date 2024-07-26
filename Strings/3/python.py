def replace_character(str, ch1, ch2):
    result = []
    for char in str:
        if char == ch1:
            result.append(ch2)
        elif char == ch2:
            result.append(ch1)
        else:
            result.append(char)
    return ''.join(result)

# Sample Test
str = "apples"
ch1 = 'a'
ch2 = 'p'
print(replace_character(str, ch1, ch2))  # Output: "paales"
