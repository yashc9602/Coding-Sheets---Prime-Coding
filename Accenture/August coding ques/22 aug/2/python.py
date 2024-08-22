def checkPrime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def checkGoogly(num):
    s = 0
    while num > 0:
        digit = num % 10
        s += digit
        num //= 10
    return checkPrime(s)

num = 22
print(checkGoogly(num))
