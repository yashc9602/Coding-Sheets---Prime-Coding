def sum_of_divisors(N):
    sum_div = 0
    for i in range(1, N + 1):
        if N % i == 0:
            sum_div += i
    return sum_div

# Example usage
N = 12
print(f"The sum of the divisors of {N} is {sum_of_divisors(N)}")  # Output should be 28
