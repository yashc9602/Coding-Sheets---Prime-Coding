def find_pair_with_sum(array, target_sum):
    seen_numbers = {}
    for number in array:
        complement = target_sum - number
        if complement in seen_numbers:
            return (complement, number)
        seen_numbers[number] = True
    return None

# Example usage
array = [1, 2, 3, 4, 6]
target_sum = 8
result = find_pair_with_sum(array, target_sum)
if result:
    print(f"Pair found: {result}")
else:
    print("No pair found")
