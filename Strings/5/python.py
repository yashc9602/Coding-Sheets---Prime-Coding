def reverse_words(sentence):
    words = []
    word = ''
    
    # Split the string into words
    for char in sentence:
        if char == ' ':
            if word:
                words.append(word)
                word = ''
        else:
            word += char
    if word:
        words.append(word)

    # Reverse the order of words
    reversed_sentence = ''
    for i in range(len(words)-1, -1, -1):
        reversed_sentence += words[i]
        if i != 0:
            reversed_sentence += ' '
    
    return reversed_sentence

# Sample Test
input_str = "Welcome to code"
output_str = reverse_words(input_str)
print(output_str)  # Output: "code to Welcome"

input_str = "Code to Crack Puzzle"
output_str = reverse_words(input_str)
print(output_str)  # Output: "Puzzle Crack to Code"
