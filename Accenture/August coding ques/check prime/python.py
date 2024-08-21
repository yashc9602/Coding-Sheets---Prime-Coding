#check prime
def checkPrime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

#passing on index
nums = [10,20,30,40,50,60]
ans = 0
for i in range(2, len(nums)):
    if checkPrime(i):
        ans += nums[i]
print(ans)
