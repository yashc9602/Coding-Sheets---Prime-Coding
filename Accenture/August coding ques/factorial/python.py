#factorial 

def factorial(n):
    fact = 1
    for i in range(1, n+1):
        fact *= i
    return fact

# Count the consonants
vowels = "aeiouAEIOU"
s = "AFBC"
count = 0
for i in range(len(s)):
    if s[i] not in vowels:
        count += 1
ans = factorial(count)
print(ans)
