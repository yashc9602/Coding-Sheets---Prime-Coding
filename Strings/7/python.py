def replace_characters(str, ch1, ch2):
    result = ''
    
    for char in str:
        if char == ch1:
            result += ch2
        elif char == ch2:
            result += ch1
        else:
            result += char
            
    return result

# Sample Test
input_str = "apples"
ch1 = 'a'
ch2 = 'p'
output_str = replace_characters(input_str, ch1, ch2)
print(output_str)  # Output: "paales"
