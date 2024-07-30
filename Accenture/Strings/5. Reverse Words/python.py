def reverse_words(sentence):
    result = ""
    stack = []
    for i in range(len(sentence)):
        if sentence[i] == ' ':
            stack.append(result) 
            stack.append(' ')  
            result = ""
        else:
            result += sentence[i]

    stack.append(result)

    for i in range(len(stack)-1, -1, -1):
        print(stack[i], end="")

# Sample Test
input_str = "Welcome to code"
reverse_words(input_str)
