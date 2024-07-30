def are_anagrams(str1, str2):
    if len(str1) != len(str2):
        return 'no'
    sorted_str1 = sorted(str1)
    sorted_str2 = sorted(str2)
    return 'yes' if sorted_str1 == sorted_str2 else 'no'

# Sample Test
str1 = "listen"
str2 = "silent"
print(are_anagrams(str1, str2))  # Output: "yes"
