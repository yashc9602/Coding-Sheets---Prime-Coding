def transform_string(str):

    transformed_string = ""

    for i in range(len(str)):
        if str[i] == 'a':
            transformed_string += 'b'
        elif str[i] == 'b':
            transformed_string += 'a'
        else:
            transformed_string += str[i]


    return transformed_string


str = "abaabbcc"
transformed_string = transform_string(str)
print(transformed_string)